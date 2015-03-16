
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
object task extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,Person,List[Task],Form[Task],play.twirl.api.HtmlFormat.Appendable] {

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
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/jquery-ui.min.js"></script>
        <script src='"""),_display_(/*13.23*/routes/*13.29*/.Assets.at("javascripts/bootstrap-datepicker.js")),format.raw/*13.78*/("""'></script>

        <script>
        $(document).ready(function() """),format.raw/*16.38*/("""{"""),format.raw/*16.39*/("""
        """),format.raw/*17.9*/("""$('#datepicker').datepicker();
        """),format.raw/*18.9*/("""}"""),format.raw/*18.10*/(""")
        </script>
    </head>
    <body>
        <div id="wrapper">
            """),_display_(/*23.14*/dashboard("task", currentUser)),format.raw/*23.44*/("""
            """),format.raw/*24.13*/("""<div id="page-wrapper">
                """),_display_(/*25.18*/template/*25.26*/.headericon("fa fa-wrench fa-5x")),format.raw/*25.59*/("""
                """),format.raw/*26.17*/("""<div class="row">
                    <div class="col-lg-6 steps" style="padding: 20px; width: 500px">
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
                                    """),_display_(/*38.38*/helper/*38.44*/.form(action = routes.TaskData.addTask())/*38.85*/{_display_(Seq[Any](format.raw/*38.86*/("""
                                        """),format.raw/*39.41*/("""<div class="form-group">
                                            <input  type= "text" class="form-control input" id="todo_textbox" name="name" autofocus="autofocus"
                                            placeholder="What needs to be done?" />
                                        </div>
                                        <div class="row" style="padding: 0 15px">
                                            <div class="col-xs-2" style="text-align: center">
                                                <label class="control-label" for="validate-text" style="padding-top: 5px">Deadline: </label>
                                            </div>
                                            <div class="col-xs-10" style="text-align: center">
                                                <div class="input-append date form-group-sm" id="datepicker" data-date="today" data-date-format="dd-mm-yyyy">
                                                    <div class="col-xs-10">
                                                        <input type="text" name="dueDate" value="Click the Calendar icon to pick a date" id="txt" class="form-control input"
                                                        style="font-size: small; text-align: center" readonly />
                                                    </div>
                                                    <div class="col-xs-2">
                                                        <span class="add-on "><i class="fa fa-calendar fa-2x"></i></span>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="row" style="text-align: center; padding: 15px 15px 0">
                                            <div class="btn-group-lg" role="group">
                                                <button type="submit" class="btn btn-success btn-block" style="height: 30px; padding: 0">Save!</button>
                                            </div>
                                        </div>
                                    """)))}),format.raw/*64.38*/("""
                                    """),format.raw/*65.37*/("""<hr class="hr" style="margin: 15px 0 10px">
                                </div>

                                """),_display_(/*68.34*/for(t <- tasks) yield /*68.49*/{_display_(Seq[Any](format.raw/*68.50*/("""
                                    """),_display_(/*69.38*/if(t.done != true)/*69.56*/ {_display_(Seq[Any](format.raw/*69.58*/("""
                                        """),format.raw/*70.41*/("""<ul id="sortable" class="list-group" >
                                            <li class="list-group-item">
                                                <span class="pull-left">
                                                    <a href=""""),_display_(/*73.63*/routes/*73.69*/.TaskData.doneTask(t.id)),format.raw/*73.93*/("""" style="color: #000000">
                                                        <i style="font-size: larger" class="fa fa-square-o"></i>
                                                    </a>
                                                </span>
                                                <label style="padding-left:10px; margin: 0">"""),_display_(/*77.94*/t/*77.95*/.name),format.raw/*77.100*/("""</label>
                                                <span class="pull-right">
                                                    <i class="fa fa-clock-o fa-fw" title="task is due on: """),_display_(/*79.108*/t/*79.109*/.dueDate.toString.substring(0,10)),format.raw/*79.142*/(""""></i>
                                                    <label style="padding: 0 7px 0 4px">|</label>
                                                    <a href=""""),_display_(/*81.63*/routes/*81.69*/.TaskData.deleteTask(t.id)),format.raw/*81.95*/("""" style="color: red; font-size: larger"><i class="fa fa-close"></i></a>
                                                </span>
                                            </li>
                                        </ul>
                                    """)))}),format.raw/*85.38*/("""
                                """)))}),format.raw/*86.34*/("""
                            """),format.raw/*87.29*/("""</div>
                        </div>
                    </div>
                    <div class="col-lg-6 steps" style="padding: 20px; width: 500px">
                        <div class="panel panel-success">
                            <div class="panel-heading"><h3 class="text-center" style="margin: 0">Done</h3></div>
                            <div class="panel-body" style="min-height: 450px; padding-top: 20px">
                            """),_display_(/*94.30*/for(t <- tasks) yield /*94.45*/{_display_(Seq[Any](format.raw/*94.46*/("""
                                """),_display_(/*95.34*/if(t.done == true )/*95.53*/ {_display_(Seq[Any](format.raw/*95.55*/("""
                                    """),format.raw/*96.37*/("""<ul id="sortable" class="list-group"  >
                                        <li class="list-group-item">
                                            <span class="pull-left">
                                                <a href=""""),_display_(/*99.59*/routes/*99.65*/.TaskData.undoTask(t.id)),format.raw/*99.89*/("""" style="color: #000000">
                                                    <i style="font-size: larger" class="fa fa-check-square-o"></i>
                                                </a>
                                            </span>
                                            <label style="padding-left:10px; margin:0"><strike>"""),_display_(/*103.97*/t/*103.98*/.name),format.raw/*103.103*/("""</strike></label>
                                            <span class="pull-right">
                                                <i class="fa fa-clock-o fa-fw" title="task is due on: """),_display_(/*105.104*/t/*105.105*/.dueDate.toString.substring(0,10)),format.raw/*105.138*/(""""></i>
                                                <label style="padding: 0 7px 0 4px">|</label>
                                                <a  href=""""),_display_(/*107.60*/routes/*107.66*/.TaskData.undoTask(t.id)),format.raw/*107.90*/("""" ><i class="fa fa-refresh "></i></a>
                                                <label style="padding: 0 7px 0 4px">|</label>
                                                <a href=""""),_display_(/*109.59*/routes/*109.65*/.TaskData.deleteTask(t.id)),format.raw/*109.91*/("""" style="color: red; font-size: larger"><i class="fa fa-close"></i></a>
                                            </span>
                                        </li>
                                    </ul>
                                """)))}),format.raw/*113.34*/("""
                            """)))}),format.raw/*114.30*/("""
                            """),format.raw/*115.29*/("""</div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
            <!--bootstrap-->
        <script src="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>

            <!--sb-Admin-->
        <script src=""""),_display_(/*125.23*/routes/*125.29*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*125.68*/(""""></script>
        <script src=""""),_display_(/*126.23*/routes/*126.29*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*126.89*/(""""></script>
    </body>
</html>"""))}
  }

  def render(title:String,currentUser:Person,tasks:List[Task],taskform:Form[Task]): play.twirl.api.HtmlFormat.Appendable = apply(title)(currentUser,tasks,taskform)

  def f:((String) => (Person,List[Task],Form[Task]) => play.twirl.api.HtmlFormat.Appendable) = (title) => (currentUser,tasks,taskform) => apply(title)(currentUser,tasks,taskform)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:03 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/task.scala.html
                  HASH: 009ce20f891e6445e3e5871f8beccea2630cd9bb
                  MATRIX: 751->1|962->78|989->128|1042->155|1060->165|1097->182|1137->195|1231->263|1245->269|1297->301|1595->572|1610->578|1680->627|1775->694|1804->695|1840->704|1906->743|1935->744|2045->827|2096->857|2137->870|2205->911|2222->919|2276->952|2321->969|3255->1876|3270->1882|3320->1923|3359->1924|3428->1965|5688->4194|5753->4231|5897->4348|5928->4363|5967->4364|6032->4402|6059->4420|6099->4422|6168->4463|6442->4710|6457->4716|6502->4740|6874->5085|6884->5086|6911->5091|7129->5281|7140->5282|7195->5315|7389->5482|7404->5488|7451->5514|7743->5775|7808->5809|7865->5838|8340->6286|8371->6301|8410->6302|8471->6336|8499->6355|8539->6357|8604->6394|8867->6630|8882->6636|8927->6660|9297->7002|9308->7003|9336->7008|9556->7199|9568->7200|9624->7233|9812->7393|9828->7399|9874->7423|10092->7613|10108->7619|10156->7645|10433->7890|10495->7920|10553->7949|10882->8250|10898->8256|10959->8295|11021->8329|11037->8335|11119->8395
                  LINES: 26->1|30->1|31->4|33->6|33->6|33->6|34->7|35->8|35->8|35->8|40->13|40->13|40->13|43->16|43->16|44->17|45->18|45->18|50->23|50->23|51->24|52->25|52->25|52->25|53->26|65->38|65->38|65->38|65->38|66->39|91->64|92->65|95->68|95->68|95->68|96->69|96->69|96->69|97->70|100->73|100->73|100->73|104->77|104->77|104->77|106->79|106->79|106->79|108->81|108->81|108->81|112->85|113->86|114->87|121->94|121->94|121->94|122->95|122->95|122->95|123->96|126->99|126->99|126->99|130->103|130->103|130->103|132->105|132->105|132->105|134->107|134->107|134->107|136->109|136->109|136->109|140->113|141->114|142->115|152->125|152->125|152->125|153->126|153->126|153->126
                  -- GENERATED --
              */
          