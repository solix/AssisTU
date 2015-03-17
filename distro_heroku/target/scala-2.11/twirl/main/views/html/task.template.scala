
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
        <script src='"""),_display_(/*11.23*/routes/*11.29*/.WebJarAssets.at(WebJarAssets.locate("jquery.min.js"))),format.raw/*11.83*/("""'></script>
        <script src='"""),_display_(/*12.23*/routes/*12.29*/.WebJarAssets.at(WebJarAssets.locate("jquery-ui.min.js"))),format.raw/*12.86*/("""'></script>
        """),format.raw/*13.81*/("""
        """),format.raw/*14.9*/("""<script src='"""),_display_(/*14.23*/routes/*14.29*/.Assets.at("javascripts/bootstrap-datepicker.js")),format.raw/*14.78*/("""'></script>
        <script>
        $(document).ready(function() """),format.raw/*16.38*/("""{"""),format.raw/*16.39*/("""
        """),format.raw/*17.9*/("""$('#datepicker').datepicker();"""),format.raw/*17.39*/("""}"""),format.raw/*17.40*/(""")
        </script>
    </head>
    <body>
        <div id="wrapper">
            """),_display_(/*22.14*/dashboard("task", currentUser)),format.raw/*22.44*/("""
            """),format.raw/*23.13*/("""<div id="page-wrapper">
                """),_display_(/*24.18*/template/*24.26*/.headericon("fa fa-wrench fa-5x")),format.raw/*24.59*/("""

                """),format.raw/*26.17*/("""<div class="input-group-btn text-center">
                    <button  type="button" class="btn btn-success btn-lg" data-toggle="collapse" data-target="#taskform" aria-expanded="false" aria-controls="taskform"><i class="glyphicon glyphicon-plus"></i></button>

                </div>

                <div class="collapse" id="taskform">

                """),_display_(/*33.18*/form(action = routes.TaskData.addTask())/*33.58*/{_display_(Seq[Any](format.raw/*33.59*/("""

                        """),format.raw/*35.25*/("""<div class="form-group">
                            <label for="todo_textbox" class="control-label">Name</label>
                            <input  type= "text" class="form-control input" id="todo_textbox" name="name" autofocus="autofocus" placeholder="what todo?" />

                        </div>
                    <div class="raw">
                        <div class="col-xs-12 col-lg-8">

                        <div class="input-append date form-group-sm" id="datepicker" data-date="today" data-date-format="dd-mm-yyyy">
                            <div class="col-xs-10">
                            <input type="text" name="dueDate" value="e.g. 12-12-2015"   id="txt" class="form-control input" readonly />
                            </div>
                            <div class="col-xs-2">
                            <span class="add-on "><i class="fa fa-calendar fa-2x"></i></span>
                            </div>
                        </div>
                        </div>
                    </div>
                        <div class="form-group">
                            <button type="submit" class="btn btn-primary ">Save</button>
                            <button type="button" class="btn btn-default " >Cancel</button>
                        </div>







                """)))}),format.raw/*64.18*/("""
                """),format.raw/*65.17*/("""</div>


                <div class="col-sm-12 steps">
                    <h2 class=" text-center">TO DO(s)</h2>
                    <ul id="sortable" class="list-group" >
                    """),_display_(/*71.22*/for(t <- tasks) yield /*71.37*/{_display_(Seq[Any](format.raw/*71.38*/("""
                        """),_display_(/*72.26*/if(t.done != true)/*72.44*/ {_display_(Seq[Any](format.raw/*72.46*/("""
                            """),format.raw/*73.29*/("""<li class="list-group-item">

                                """),_display_(/*75.34*/t/*75.35*/.name),format.raw/*75.40*/("""

                                """),format.raw/*77.33*/("""<span class="pull-right">
                                    <button type="text"  href="#" data-toggle="tooltip" data-placement="left" title="task is due on: """),_display_(/*78.135*/t/*78.136*/.dueDate.toString.substring(0,10)),format.raw/*78.169*/(""""><i class="fa fa-clock-o "></i></button>
                                    <a  href=""""),_display_(/*79.48*/routes/*79.54*/.TaskData.deleteTask(t.id)),format.raw/*79.80*/(""""><i class="fa fa-trash-o "></i></a>
                                    <a  href=""""),_display_(/*80.48*/routes/*80.54*/.TaskData.doneTask(t.id)),format.raw/*80.78*/("""" ><i class="fa fa-check "></i></a>
                                </span>

                            </li>
                        """)))}),format.raw/*84.26*/("""
                    """)))}),format.raw/*85.22*/("""
                    """),format.raw/*86.21*/("""</ul>
                </div>



                <div class="col-sm-12 steps">
                    <h2 class=" text-center">Done</h2>
                    <ul id="sortable" class="list-group"  >
                    """),_display_(/*94.22*/for(t <- tasks) yield /*94.37*/{_display_(Seq[Any](format.raw/*94.38*/("""
                        """),_display_(/*95.26*/if(t.done == true )/*95.45*/ {_display_(Seq[Any](format.raw/*95.47*/("""
                            """),format.raw/*96.29*/("""<li class="list-group-item">

                                """),_display_(/*98.34*/t/*98.35*/.name),format.raw/*98.40*/("""

                                """),format.raw/*100.33*/("""<span class="pull-right">
                                    <button type="text"   href="#" data-toggle="tooltip" data-placement="left" title="task was due on: """),_display_(/*101.137*/t/*101.138*/.dueDate.toString.substring(0,10)),format.raw/*101.171*/(""""><i class="fa fa-clock-o "></i></button>
                                    <a  href=""""),_display_(/*102.48*/routes/*102.54*/.TaskData.deleteTask(t.id)),format.raw/*102.80*/(""""><i class="fa fa-trash-o "></i></a>
                                    <a  href=""""),_display_(/*103.48*/routes/*103.54*/.TaskData.undoTask(t.id)),format.raw/*103.78*/("""" ><i class="fa fa-refresh "></i></a>
                                </span>

                            </li>
                        """)))}),format.raw/*107.26*/("""
                    """)))}),format.raw/*108.22*/("""
                    """),format.raw/*109.21*/("""</ul>
                </div>





            </div>
        </div>


            <!--bootstrap-->
        <script src="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
            <!--sb-Admin-->
        <script src=""""),_display_(/*123.23*/routes/*123.29*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*123.68*/(""""></script>
        <script src=""""),_display_(/*124.23*/routes/*124.29*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*124.89*/(""""></script>




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
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/task.scala.html
                  HASH: c90fc415e011410d0db33c28016e689d34191c09
                  MATRIX: 751->1|962->78|989->128|1042->155|1060->165|1097->182|1137->195|1231->263|1245->269|1297->301|1395->372|1410->378|1485->432|1546->466|1561->472|1639->529|1687->621|1723->630|1764->644|1779->650|1849->699|1943->765|1972->766|2008->775|2066->805|2095->806|2205->889|2256->919|2297->932|2365->973|2382->981|2436->1014|2482->1032|2865->1388|2914->1428|2953->1429|3007->1455|4347->2764|4392->2781|4613->2975|4644->2990|4683->2991|4736->3017|4763->3035|4803->3037|4860->3066|4950->3129|4960->3130|4986->3135|5048->3169|5236->3329|5247->3330|5302->3363|5418->3452|5433->3458|5480->3484|5591->3568|5606->3574|5651->3598|5818->3734|5871->3756|5920->3777|6161->3991|6192->4006|6231->4007|6284->4033|6312->4052|6352->4054|6409->4083|6499->4146|6509->4147|6535->4152|6598->4186|6789->4348|6801->4349|6857->4382|6974->4471|6990->4477|7038->4503|7150->4587|7166->4593|7212->4617|7382->4755|7436->4777|7486->4798|7762->5046|7778->5052|7839->5091|7901->5125|7917->5131|7999->5191
                  LINES: 26->1|30->1|31->4|33->6|33->6|33->6|34->7|35->8|35->8|35->8|38->11|38->11|38->11|39->12|39->12|39->12|40->13|41->14|41->14|41->14|41->14|43->16|43->16|44->17|44->17|44->17|49->22|49->22|50->23|51->24|51->24|51->24|53->26|60->33|60->33|60->33|62->35|91->64|92->65|98->71|98->71|98->71|99->72|99->72|99->72|100->73|102->75|102->75|102->75|104->77|105->78|105->78|105->78|106->79|106->79|106->79|107->80|107->80|107->80|111->84|112->85|113->86|121->94|121->94|121->94|122->95|122->95|122->95|123->96|125->98|125->98|125->98|127->100|128->101|128->101|128->101|129->102|129->102|129->102|130->103|130->103|130->103|134->107|135->108|136->109|150->123|150->123|150->123|151->124|151->124|151->124
                  -- GENERATED --
              */
          