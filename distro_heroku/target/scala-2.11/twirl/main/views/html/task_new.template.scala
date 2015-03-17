
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object task_new extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,Person,List[Task],Form[Task],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(currentUser :Person, tasks: List[Task], taskform: Form[Task]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import helper.twitterBootstrap

Seq[Any](format.raw/*1.79*/("""
"""),format.raw/*4.1*/("""<html>
    <head>
        """),_display_(/*6.10*/linkLoader/*6.20*/.headlinks(title)),format.raw/*6.37*/("""
            """),format.raw/*7.13*/("""<!-- loading task stylesheet(s)& script(s) -->
        <link href=""""),_display_(/*8.22*/routes/*8.28*/.Assets.at("css/datepicker.css")),format.raw/*8.60*/("""" rel="stylesheet">

            <!-- jQuery -->
        """),format.raw/*11.98*/("""
        """),format.raw/*12.9*/("""<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js"></script>
        """),format.raw/*14.101*/("""
        """),format.raw/*15.81*/("""
        """),format.raw/*16.9*/("""<script src='"""),_display_(/*16.23*/routes/*16.29*/.Assets.at("javascripts/bootstrap-datepicker.js")),format.raw/*16.78*/("""'></script>

        <script>
            $(document).ready(function() """),format.raw/*19.42*/("""{"""),format.raw/*19.43*/("""
                """),format.raw/*20.17*/("""$('#datepicker').datepicker();
            """),format.raw/*21.13*/("""}"""),format.raw/*21.14*/(""")
        </script>
    </head>
    <body>
        <div id="wrapper">
            """),_display_(/*26.14*/dashboard("task", currentUser)),format.raw/*26.44*/("""
            """),format.raw/*27.13*/("""<div id="page-wrapper">
                """),_display_(/*28.18*/template/*28.26*/.headericon("fa fa-wrench fa-5x")),format.raw/*28.59*/("""
                """),format.raw/*29.17*/("""<div class="row">
                    <div class="col-lg-6 steps" style="padding: 50px">
                        <div class="panel panel-info">
                            <div class="panel-heading">
                                <button  type="button" style="text-align: center" class="btn btn-success pull-left" data-toggle="collapse"
                                data-target="#taskform" aria-expanded="false" aria-controls="taskform">
                                    <i class="fa fa-plus"></i>
                                </button>
                                <h3 class="text-center" style="margin: 0; padding-right: 45px">To Do</h3>
                            </div>
                            <div class="panel-body" style="min-height: 450px; padding-top: 20px">
                                <div class="collapse" id="taskform">
                                    """),_display_(/*41.38*/helper/*41.44*/.form(action = routes.TaskData.addTask())/*41.85*/{_display_(Seq[Any](format.raw/*41.86*/("""
                                        """),format.raw/*42.41*/("""<div class="form-group">
                                            <input  type= "text" class="form-control input" id="todo_textbox" name="name" autofocus="autofocus"
                                            placeholder="What needs to be done?" />
                                        </div>
                                        <div class="row" style="padding: 0 15px">
                                            <div class="col-lg-2" style="text-align: center">
                                                <label class="control-label" for="validate-text" style="padding-top: 5px">Deadline: </label>
                                            </div>
                                            <div class="col-lg-8" style="text-align: center">
                                                <div class="input-append date form-group-sm" id="datepicker" data-date="today" data-date-format="dd-mm-yyyy">
                                                    <div class="col-xs-10">
                                                        <input type="text" name="dueDate" value="e.g. 12-12-2015" id="txt" class="form-control input"
                                                        style="font-size: small; text-align: center" readonly />
                                                    </div>
                                                    <div class="col-xs-2">
                                                        <span class="add-on "><i class="fa fa-calendar fa-2x"></i></span>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-lg-2" style="text-align: center">
                                                <div class="btn-group" role="group">
                                                    <button type="submit" class="btn btn-success">Save!</button>
                                                </div>
                                            </div>
                                        </div>
                                    """)))}),format.raw/*67.38*/("""
                                    """),format.raw/*68.37*/("""<hr class="hr" style="margin: 15px 0 10px">
                                </div>

                                """),_display_(/*71.34*/for(t <- tasks) yield /*71.49*/{_display_(Seq[Any](format.raw/*71.50*/("""
                                    """),_display_(/*72.38*/if(t.done != true)/*72.56*/ {_display_(Seq[Any](format.raw/*72.58*/("""
                                        """),format.raw/*73.41*/("""<ul id="sortable" class="list-group" >
                                        <li class="list-group-item">
                                            <span class="pull-left">
                                                <a href=""""),_display_(/*76.59*/routes/*76.65*/.TaskData.doneTask(t.id)),format.raw/*76.89*/("""" style="color: #000000">
                                                    <i style="font-size: larger" class="fa fa-square-o"></i>
                                                </a>
                                            </span>
                                               <label style="padding-left:10px; margin: 0">"""),_display_(/*80.93*/t/*80.94*/.name),format.raw/*80.99*/("""</label>
                                            <span class="pull-right">
                                                <i class="fa fa-clock-o fa-fw" title="task is due on: """),_display_(/*82.104*/t/*82.105*/.dueDate.toString.substring(0,10)),format.raw/*82.138*/(""""></i>
                                                <label style="padding: 0 7px 0 4px">|</label>
                                                <a href=""""),_display_(/*84.59*/routes/*84.65*/.TaskData.deleteTask(t.id)),format.raw/*84.91*/("""" style="color: red; font-size: larger"><i class="fa fa-close"></i></a>
                                            </span>
                                        </li>
                                        </ul>
                                    """)))}),format.raw/*88.38*/("""
                                """)))}),format.raw/*89.34*/("""
                            """),format.raw/*90.29*/("""</div>
                        </div>
                    </div>
                    <div class="col-lg-6 steps" style="padding: 50px">
                        <div class="panel panel-success">
                            <div class="panel-heading"><h3 class="text-center" style="margin: 0">Done</h3></div>
                            <div class="panel-body" style="min-height: 450px; padding-top: 20px">
                                """),_display_(/*97.34*/for(t <- tasks) yield /*97.49*/{_display_(Seq[Any](format.raw/*97.50*/("""
                                    """),_display_(/*98.38*/if(t.done == true )/*98.57*/ {_display_(Seq[Any](format.raw/*98.59*/("""
                                        """),format.raw/*99.41*/("""<ul id="sortable" class="list-group"  >
                                            <li class="list-group-item">
                                                <span class="pull-left">
                                                    <a href=""""),_display_(/*102.63*/routes/*102.69*/.TaskData.undoTask(t.id)),format.raw/*102.93*/("""" style="color: #000000">
                                                        <i style="font-size: larger" class="fa fa-check-square-o"></i>
                                                    </a>
                                                </span>
                                                <label style="padding-left:10px; margin:0"><strike>"""),_display_(/*106.101*/t/*106.102*/.name),format.raw/*106.107*/("""</strike></label>
                                                <span class="pull-right">
                                                    <i class="fa fa-clock-o fa-fw" title="task is due on: """),_display_(/*108.108*/t/*108.109*/.dueDate.toString.substring(0,10)),format.raw/*108.142*/(""""></i>
                                                    <label style="padding: 0 7px 0 4px">|</label>
                                                    <a  href=""""),_display_(/*110.64*/routes/*110.70*/.TaskData.undoTask(t.id)),format.raw/*110.94*/("""" ><i class="fa fa-refresh "></i></a>
                                                    <label style="padding: 0 7px 0 4px">|</label>
                                                    <a href=""""),_display_(/*112.63*/routes/*112.69*/.TaskData.deleteTask(t.id)),format.raw/*112.95*/("""" style="color: red; font-size: larger"><i class="fa fa-close"></i></a>
                                                </span>
                                            </li>
                                        </ul>
                                    """)))}),format.raw/*116.38*/("""
                                """)))}),format.raw/*117.34*/("""
                            """),format.raw/*118.29*/("""</div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
            <!--bootstrap-->
        <script src="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
            <!--sb-Admin-->
        <script src=""""),_display_(/*127.23*/routes/*127.29*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*127.68*/(""""></script>
        <script src=""""),_display_(/*128.23*/routes/*128.29*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*128.89*/(""""></script>




    </body>
</html>"""))}
  }

  def render(title:String,currentUser:Person,tasks:List[Task],taskform:Form[Task]): play.twirl.api.HtmlFormat.Appendable = apply(title)(currentUser,tasks,taskform)

  def f:((String) => (Person,List[Task],Form[Task]) => play.twirl.api.HtmlFormat.Appendable) = (title) => (currentUser,tasks,taskform) => apply(title)(currentUser,tasks,taskform)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:16 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/task_new.scala.html
                  HASH: d746cab35737969a4549fa4963abfd5325a014a2
                  MATRIX: 755->1|966->78|993->128|1046->155|1064->165|1101->182|1141->195|1235->263|1249->269|1301->301|1386->447|1422->456|1651->748|1688->829|1724->838|1765->852|1780->858|1850->907|1949->978|1978->979|2023->996|2094->1039|2123->1040|2233->1123|2284->1153|2325->1166|2393->1207|2410->1215|2464->1248|2509->1265|3429->2158|3444->2164|3494->2205|3533->2206|3602->2247|5795->4409|5860->4446|6004->4563|6035->4578|6074->4579|6139->4617|6166->4635|6206->4637|6275->4678|6537->4913|6552->4919|6597->4943|6956->5275|6966->5276|6992->5281|7202->5463|7213->5464|7268->5497|7454->5656|7469->5662|7516->5688|7800->5941|7865->5975|7922->6004|8387->6442|8418->6457|8457->6458|8522->6496|8550->6515|8590->6517|8659->6558|8935->6806|8951->6812|8997->6836|9384->7194|9396->7195|9424->7200|9652->7399|9664->7400|9720->7433|9916->7601|9932->7607|9978->7631|10204->7829|10220->7835|10268->7861|10561->8122|10627->8156|10685->8185|11013->8485|11029->8491|11090->8530|11152->8564|11168->8570|11250->8630
                  LINES: 26->1|30->1|31->4|33->6|33->6|33->6|34->7|35->8|35->8|35->8|38->11|39->12|41->14|42->15|43->16|43->16|43->16|43->16|46->19|46->19|47->20|48->21|48->21|53->26|53->26|54->27|55->28|55->28|55->28|56->29|68->41|68->41|68->41|68->41|69->42|94->67|95->68|98->71|98->71|98->71|99->72|99->72|99->72|100->73|103->76|103->76|103->76|107->80|107->80|107->80|109->82|109->82|109->82|111->84|111->84|111->84|115->88|116->89|117->90|124->97|124->97|124->97|125->98|125->98|125->98|126->99|129->102|129->102|129->102|133->106|133->106|133->106|135->108|135->108|135->108|137->110|137->110|137->110|139->112|139->112|139->112|143->116|144->117|145->118|154->127|154->127|154->127|155->128|155->128|155->128
                  -- GENERATED --
              */
          