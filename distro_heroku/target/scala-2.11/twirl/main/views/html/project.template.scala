
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
object project extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Person,Project,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(currentUser:Person)(project: Project):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.55*/("""
    """),format.raw/*2.5*/("""<html lang="en">
        <head>
            """),_display_(/*4.14*/linkLoader/*4.24*/.headlinks(title)),format.raw/*4.41*/("""
        """),format.raw/*5.9*/("""</head>
        <body>
            <div id="wrapper">
                """),_display_(/*8.18*/dashboard("project", currentUser)),format.raw/*8.51*/("""
                """),format.raw/*9.17*/("""<div id="page-wrapper">
                    """),_display_(/*10.22*/template/*10.30*/.headericon("fa fa-line-chart fa-5x")),format.raw/*10.67*/("""
                    """),format.raw/*11.21*/("""<div class="row">
                        <div class="col-xs-12" style="text-align: center; margin: 1% 0">
                            <div class="btn-group pull-left" role="group" style="padding-left: 30px">
                                <a style="width: 175px" type="button" class="btn btn-success" href=""""),_display_(/*14.102*/routes/*14.108*/.ProjectData.createProjectPage()),format.raw/*14.140*/("""">Create a new project</a>
                            </div>
                            <div class="btn-group" role="group">
                                <button style="width: 175px" type="button" class="btn btn-default"
                                data-toggle="modal" data-target="#archivedProjectList"
                                """),_display_(/*19.34*/if(PersonData.findArchivedProjects.isEmpty)/*19.77*/{_display_(Seq[Any](format.raw/*19.78*/("""disabled""")))}),format.raw/*19.87*/(""">Archived projects</button>
                            </div>
                            <div class="btn-group pull-right" role="group" style="padding-right: 30px">
                                <button style="width: 175px" type="button" class="btn btn-info dropdown-toggle" id="invitations"
                                data-toggle="dropdown" aria-expanded="true" """),_display_(/*23.78*/if(PersonData.findPendingInvitations().isEmpty)/*23.125*/{_display_(Seq[Any](format.raw/*23.126*/("""disabled""")))}),format.raw/*23.135*/(""">
                                    Invitations: """),_display_(/*24.51*/PersonData/*24.61*/.findPendingInvitations().size()),format.raw/*24.93*/("""
                                """),format.raw/*25.33*/("""</button>
                                <ul class="dropdown-menu pull-left" role="menu" aria-labelledby="invitations" style="margin-right: 30px; padding: 0">
                                    """),_display_(/*27.38*/defining(PersonData.findPendingInvitations())/*27.83*/ { projects_pending =>_display_(Seq[Any](format.raw/*27.105*/("""
                                        """),_display_(/*28.42*/for(pp <- projects_pending) yield /*28.69*/{_display_(Seq[Any](format.raw/*28.70*/("""
                                            """),format.raw/*29.45*/("""<li role="presentation" style="padding: 5px; margin: 0">

                                                <div class="panel panel-primary" style="margin: 0">
                                                    <div class="panel-body" style="width: 365px; background-color: #5bc0de; padding: 5px">
                                                        """),_display_(/*33.58*/defining(Role.find.where().eq("person", currentUser).eq("project", pp).findUnique().role)/*33.147*/ { role =>_display_(Seq[Any](format.raw/*33.157*/("""
                                                            """),format.raw/*34.61*/("""<div class="row">
                                                                <div class="col-xs-3">
                                                                    """),_display_(/*36.70*/if(role.equals(Role.OWNER))/*36.97*/ {_display_(Seq[Any](format.raw/*36.99*/("""
                                                                        """),format.raw/*37.73*/("""<label style="opacity : 0.8 ; color : white ; margin : 40% 0 0 18px">
                                                                            <i class="fa fa-mortar-board fa-3x"></i>
                                                                        </label>
                                                                    """)))}),format.raw/*40.70*/("""
                                                                    """),_display_(/*41.70*/if(role.equals(Role.REVIEWER))/*41.100*/ {_display_(Seq[Any](format.raw/*41.102*/("""
                                                                        """),format.raw/*42.73*/("""<label style="opacity : 0.8 ; color : white ; margin : 40% 0 0 22px">
                                                                            <i class="fa fa-edit fa-3x"></i>
                                                                        </label>
                                                                    """)))}),format.raw/*45.70*/("""
                                                                    """),_display_(/*46.70*/if(role.equals(Role.GUEST))/*46.97*/ {_display_(Seq[Any](format.raw/*46.99*/("""
                                                                        """),format.raw/*47.73*/("""<label style="opacity : 0.8 ; color : white ; margin : 40% 0 0 22px">
                                                                            <i class="fa fa-suitcase fa-3x"></i>
                                                                        </label>
                                                                    """)))}),format.raw/*50.70*/("""
                                                                """),format.raw/*51.65*/("""</div>
                                                                <div class="col-xs-9">
                                                                    <p class="pull-right" style="margin : 0 ; color : white">
                                                                        You have been invited to join project '"""),_display_(/*54.113*/pp/*54.115*/.name),format.raw/*54.120*/("""'
                                                                    as """),_display_(/*55.73*/if(role.equals(Role.OWNER))/*55.100*/ {_display_(Seq[Any](format.raw/*55.102*/("""an""")))}/*55.106*/else/*55.111*/{_display_(Seq[Any](format.raw/*55.112*/("""a""")))}),format.raw/*55.114*/(""" """),format.raw/*55.115*/("""<u>"""),_display_(/*55.119*/role),format.raw/*55.123*/("""</u>
                                                                        .
                                                                    </p>
                                                                    <div class="row" style="padding-top : 20px ; text-align : right ;">
                                                                        <div class="btn-group" role="group" style="padding : 20px 2px 5px;">
                                                                            <a type="button" href=""""),_display_(/*60.101*/routes/*60.107*/.ProjectData.hasDeclined(pp.id)),format.raw/*60.138*/("""" class="btn btn-danger pull-right"
                                                                            style="font-size : smaller ; width : 120px">
                                                                                No thanks.</a>
                                                                        </div>
                                                                        <div class="btn-group" role="group" style="padding : 20px 20px 5px 2px;">
                                                                            <a type="submit" href=""""),_display_(/*65.101*/routes/*65.107*/.ProjectData.hasAccepted(pp.id)),format.raw/*65.138*/("""" class="btn btn-success pull-right"
                                                                            style="font-size : smaller ; width : 120px">
                                                                                Yeah sure!</a>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        """)))}),format.raw/*72.58*/("""
                                                    """),format.raw/*73.53*/("""</div>
                                                </div>
                                            </li>
                                        """)))}),format.raw/*76.42*/("""
                                    """)))}),format.raw/*77.38*/("""
                                """),format.raw/*78.33*/("""</ul>
                            </div>
                        </div>
                    </div>
                    """),_display_(/*82.22*/projects/*82.30*/.projectNavBar(currentUser, project)),format.raw/*82.66*/("""
                    """),_display_(/*83.22*/projects/*83.30*/.projectContent(currentUser, project)),format.raw/*83.67*/("""
                """),format.raw/*84.17*/("""</div>
            </div>
            """),format.raw/*86.36*/("""
            """),_display_(/*87.14*/template/*87.22*/.mediummodal("archivedProjectList")/*87.57*/("info")/*87.65*/("List of Archived Projects")/*87.94*/ {_display_(Seq[Any](format.raw/*87.96*/("""
                    """),format.raw/*88.21*/("""<!-- Table -->
                <table class="table" style="table-layout: fixed">
                    <thead>
                        <tr>
                            <th>Folder Name</th>
                            <th>Project Name</th>
                            <th>Date Archived</th>
                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*98.22*/PersonData/*98.32*/.findArchivedProjects.map/*98.57*/{ p =>_display_(Seq[Any](format.raw/*98.63*/("""
                        """),format.raw/*99.25*/("""<tr>
                            <td style="overflow: hidden; white-space: nowrap; text-overflow: ellipsis">"""),_display_(/*100.105*/p/*100.106*/.folder),format.raw/*100.113*/("""</td>
                            <td style="overflow: hidden; white-space: nowrap; text-overflow: ellipsis">"""),_display_(/*101.105*/p/*101.106*/.name),format.raw/*101.111*/("""</td>
                            <td style="overflow: hidden; white-space: nowrap; text-overflow: ellipsis">"""),_display_(/*102.105*/p/*102.106*/.dateArchived.toString.substring(0,10)),format.raw/*102.144*/("""</td>
                        </tr>
                    """)))}),format.raw/*104.22*/("""
                    """),format.raw/*105.21*/("""</tbody>
                </table>
            """)))}),format.raw/*107.14*/("""
                """),format.raw/*108.17*/("""<!-- jQuery -->
            <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js" ></script>
                <!--bootstrap-->
            <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
                <!--sb-Admin javascript Needed for Dropdown to work-->
            <script src=""""),_display_(/*113.27*/routes/*113.33*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*113.72*/(""""></script>
                <!--MetisMenu javascript Needed for Dropdown to work-->
            <script src=""""),_display_(/*115.27*/routes/*115.33*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*115.93*/(""""></script>
        </body>
    </html>
"""))}
  }

  def render(title:String,currentUser:Person,project:Project): play.twirl.api.HtmlFormat.Appendable = apply(title)(currentUser)(project)

  def f:((String) => (Person) => (Project) => play.twirl.api.HtmlFormat.Appendable) = (title) => (currentUser) => (project) => apply(title)(currentUser)(project)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:16 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/project.scala.html
                  HASH: 551195a00f7bc5c16847549b5f1a8ef863b4b46a
                  MATRIX: 740->1|881->54|912->59|983->104|1001->114|1038->131|1073->140|1170->211|1223->244|1267->261|1339->306|1356->314|1414->351|1463->372|1801->682|1817->688|1871->720|2244->1066|2296->1109|2335->1110|2375->1119|2775->1492|2832->1539|2872->1540|2913->1549|2992->1601|3011->1611|3064->1643|3125->1676|3349->1873|3403->1918|3464->1940|3533->1982|3576->2009|3615->2010|3688->2055|4069->2409|4168->2498|4217->2508|4306->2569|4507->2743|4543->2770|4583->2772|4684->2845|5052->3182|5149->3252|5189->3282|5230->3284|5331->3357|5691->3686|5788->3756|5824->3783|5864->3785|5965->3858|6329->4191|6422->4256|6782->4588|6794->4590|6821->4595|6922->4669|6959->4696|7000->4698|7023->4702|7037->4707|7077->4708|7111->4710|7141->4711|7173->4715|7199->4719|7756->5248|7772->5254|7825->5285|8430->5862|8446->5868|8499->5899|9132->6501|9213->6554|9397->6707|9466->6745|9527->6778|9674->6898|9691->6906|9748->6942|9797->6964|9814->6972|9872->7009|9917->7026|9983->7087|10024->7101|10041->7109|10085->7144|10102->7152|10140->7181|10180->7183|10229->7204|10652->7600|10671->7610|10705->7635|10749->7641|10802->7666|10940->7775|10952->7776|10982->7783|11121->7893|11133->7894|11161->7899|11300->8009|11312->8010|11373->8048|11462->8105|11512->8126|11591->8173|11637->8190|12005->8530|12021->8536|12082->8575|12220->8685|12236->8691|12318->8751
                  LINES: 26->1|29->1|30->2|32->4|32->4|32->4|33->5|36->8|36->8|37->9|38->10|38->10|38->10|39->11|42->14|42->14|42->14|47->19|47->19|47->19|47->19|51->23|51->23|51->23|51->23|52->24|52->24|52->24|53->25|55->27|55->27|55->27|56->28|56->28|56->28|57->29|61->33|61->33|61->33|62->34|64->36|64->36|64->36|65->37|68->40|69->41|69->41|69->41|70->42|73->45|74->46|74->46|74->46|75->47|78->50|79->51|82->54|82->54|82->54|83->55|83->55|83->55|83->55|83->55|83->55|83->55|83->55|83->55|83->55|88->60|88->60|88->60|93->65|93->65|93->65|100->72|101->73|104->76|105->77|106->78|110->82|110->82|110->82|111->83|111->83|111->83|112->84|114->86|115->87|115->87|115->87|115->87|115->87|115->87|116->88|126->98|126->98|126->98|126->98|127->99|128->100|128->100|128->100|129->101|129->101|129->101|130->102|130->102|130->102|132->104|133->105|135->107|136->108|141->113|141->113|141->113|143->115|143->115|143->115
                  -- GENERATED --
              */
          