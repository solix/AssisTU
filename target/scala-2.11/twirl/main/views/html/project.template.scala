
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

    """),format.raw/*3.5*/("""<html lang="en">
        <head>
            """),_display_(/*5.14*/linkLoader/*5.24*/.headlinks(title)),format.raw/*5.41*/("""
        """),format.raw/*6.9*/("""</head>
        <body>
            <div id="wrapper">
                """),_display_(/*9.18*/dashboard("project", currentUser)),format.raw/*9.51*/("""
                """),format.raw/*10.17*/("""<div id="page-wrapper">
                    """),_display_(/*11.22*/template/*11.30*/.headericon("fa fa-line-chart fa-5x")),format.raw/*11.67*/("""
                    """),format.raw/*12.21*/("""<div class="row">
                        <div class="col-xs-4" style="text-align: center; margin: 1% 0">
                            <div class="btn-group" role="group">
                                <a style="width: 155px" type="button" class="btn btn-success"  id="five" href=""""),_display_(/*15.113*/routes/*15.119*/.ProjectData.createProjectPage()),format.raw/*15.151*/("""">Create a new project</a>
                            </div>
                        </div>
                        <div class="col-xs-4" style="text-align: center; margin: 1% 0">
                            <div class="btn-group" role="group">
                                <button style="width: 155px" type="button" class="btn btn-default"
                                data-toggle="modal" data-target="#archivedProjectList"
                                """),_display_(/*22.34*/if(PersonData.findArchivedProjects.isEmpty)/*22.77*/{_display_(Seq[Any](format.raw/*22.78*/("""disabled""")))}),format.raw/*22.87*/(""">Archived projects</button>
                            </div>
                        </div>
                        <div class="col-xs-4" style="text-align: center; margin: 1% 0">
                            <div class="btn-group" role="group">
                                <button style="width: 155px" type="button" class="btn btn-info dropdown-toggle" id="invitations" data-toggle="dropdown" aria-expanded="true" """),_display_(/*27.175*/if(PersonData.findPendingInvitations().isEmpty)/*27.222*/{_display_(Seq[Any](format.raw/*27.223*/("""disabled""")))}),format.raw/*27.232*/(""">Invitations: """),_display_(/*27.247*/PersonData/*27.257*/.findPendingInvitations().size()),format.raw/*27.289*/("""</button>
                                <ul class="dropdown-menu pull-right" role="menu" aria-labelledby="invitations" style="padding: 0">
                                    """),_display_(/*29.38*/defining(PersonData.findPendingInvitations())/*29.83*/ { projects_pending =>_display_(Seq[Any](format.raw/*29.105*/("""
                                        """),_display_(/*30.42*/for(pp <- projects_pending) yield /*30.69*/{_display_(Seq[Any](format.raw/*30.70*/("""
                                            """),format.raw/*31.45*/("""<li role="presentation" style="padding: 5px; margin: 0">
                                                <div class="panel panel-primary" style="margin: 0">
                                                    <div class="panel-body" style="width: 365px; background-color: #5bc0de; padding: 5px">
                                                        """),_display_(/*34.58*/defining(Role.find.where().eq("person", currentUser).eq("project", pp).findUnique().role)/*34.147*/ { role =>_display_(Seq[Any](format.raw/*34.157*/("""
                                                            """),format.raw/*35.61*/("""<div class="row">
                                                                <div class="col-xs-3">
                                                                    """),_display_(/*37.70*/if(role.equals(Role.OWNER))/*37.97*/ {_display_(Seq[Any](format.raw/*37.99*/("""
                                                                        """),format.raw/*38.73*/("""<label style="opacity : 0.8 ; color : white ; margin : 40% 0 0 18px">
                                                                            <i class="fa fa-mortar-board fa-3x"></i>
                                                                        </label>
                                                                    """)))}),format.raw/*41.70*/("""
                                                                    """),_display_(/*42.70*/if(role.equals(Role.REVIEWER))/*42.100*/ {_display_(Seq[Any](format.raw/*42.102*/("""
                                                                        """),format.raw/*43.73*/("""<label style="opacity : 0.8 ; color : white ; margin : 40% 0 0 22px">
                                                                            <i class="fa fa-edit fa-3x"></i>
                                                                        </label>
                                                                    """)))}),format.raw/*46.70*/("""
                                                                    """),_display_(/*47.70*/if(role.equals(Role.GUEST))/*47.97*/ {_display_(Seq[Any](format.raw/*47.99*/("""
                                                                        """),format.raw/*48.73*/("""<label style="opacity : 0.8 ; color : white ; margin : 40% 0 0 22px">
                                                                            <i class="fa fa-suitcase fa-3x"></i>
                                                                        </label>
                                                                    """)))}),format.raw/*51.70*/("""
                                                                """),format.raw/*52.65*/("""</div>
                                                                <div class="col-xs-9">
                                                                    <p class="pull-right" style="margin : 0 ; color : white">
                                                                        You have been invited to join project '"""),_display_(/*55.113*/pp/*55.115*/.name),format.raw/*55.120*/("""'
                                                                    as """),_display_(/*56.73*/if(role.equals(Role.OWNER))/*56.100*/ {_display_(Seq[Any](format.raw/*56.102*/("""an""")))}/*56.106*/else/*56.111*/{_display_(Seq[Any](format.raw/*56.112*/("""a""")))}),format.raw/*56.114*/(""" """),format.raw/*56.115*/("""<u>"""),_display_(/*56.119*/role),format.raw/*56.123*/("""</u>
                                                                        .
                                                                    </p>
                                                                    <div class="row" style="padding-top : 20px ; text-align : right ;">
                                                                        <div class="btn-group" role="group" style="padding : 20px 2px 5px;">
                                                                            <a type="button" href=""""),_display_(/*61.101*/routes/*61.107*/.ProjectData.hasDeclined(pp.id)),format.raw/*61.138*/("""" class="btn btn-danger pull-right"
                                                                            style="font-size : smaller ; width : 120px">
                                                                                No thanks.</a>
                                                                        </div>
                                                                        <div class="btn-group" role="group" style="padding : 20px 20px 5px 2px;">
                                                                            <a type="submit" href=""""),_display_(/*66.101*/routes/*66.107*/.ProjectData.hasAccepted(pp.id)),format.raw/*66.138*/("""" class="btn btn-success pull-right"
                                                                            style="font-size : smaller ; width : 120px">
                                                                                Yeah sure!</a>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        """)))}),format.raw/*73.58*/("""
                                                    """),format.raw/*74.53*/("""</div>
                                                </div>
                                            </li>
                                        """)))}),format.raw/*77.42*/("""
                                    """)))}),format.raw/*78.38*/("""
                                """),format.raw/*79.33*/("""</ul>
                            </div>
                        </div>
                    </div>
                    """),_display_(/*83.22*/if(project != null)/*83.41*/ {_display_(Seq[Any](format.raw/*83.43*/("""
                        """),_display_(/*84.26*/projects/*84.34*/.projectNavBar(currentUser, project)),format.raw/*84.70*/("""
                        """),_display_(/*85.26*/projects/*85.34*/.projectContent(currentUser, project)),format.raw/*85.71*/("""
                    """)))}/*86.22*/else/*86.26*/{_display_(Seq[Any](format.raw/*86.27*/("""
                        """),format.raw/*87.25*/("""<div class="row">
                            <div class="col-lg-4 col-lg-offset-4">
                                <div class="alert alert-success" role="alert" style="text-align: center; margin-top: 150px">
                                    <p>There are no projects to show</p>
                                </div>
                            </div>
                        </div>
                    """)))}),format.raw/*94.22*/("""
                """),format.raw/*95.17*/("""</div><!--End of project page wrapper-->
            </div>
            """),format.raw/*97.36*/("""
            """),_display_(/*98.14*/template/*98.22*/.mediummodal("archivedProjectList")/*98.57*/("info")/*98.65*/("List of Archived Projects")/*98.94*/ {_display_(Seq[Any](format.raw/*98.96*/("""
                    """),format.raw/*99.21*/("""<!-- Table -->
                <table class="table" style="table-layout: fixed">
                    <thead>
                        <tr>
                            <th>Folder Name</th>
                            <th>Project Name</th>
                            <th>Date Archived</th>
                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*109.22*/PersonData/*109.32*/.findArchivedProjects.map/*109.57*/{ p =>_display_(Seq[Any](format.raw/*109.63*/("""
                        """),format.raw/*110.25*/("""<tr>
                            <td style="overflow: hidden; white-space: nowrap; text-overflow: ellipsis">"""),_display_(/*111.105*/p/*111.106*/.folder),format.raw/*111.113*/("""</td>
                            <td style="overflow: hidden; white-space: nowrap; text-overflow: ellipsis">"""),_display_(/*112.105*/p/*112.106*/.name),format.raw/*112.111*/("""</td>
                            <td style="overflow: hidden; white-space: nowrap; text-overflow: ellipsis">"""),_display_(/*113.105*/p/*113.106*/.dateArchived.toString.substring(0,10)),format.raw/*113.144*/("""</td>
                        </tr>
                    """)))}),format.raw/*115.22*/("""
                    """),format.raw/*116.21*/("""</tbody>
                </table>
            """)))}),format.raw/*118.14*/("""
            """),format.raw/*119.13*/("""<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>    
            
                <!--sb-Admin javascript Needed for Dropdown to work-->
            <script src=""""),_display_(/*123.27*/routes/*123.33*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*123.72*/(""""></script>
                <!--MetisMenu javascript Needed for Dropdown to work-->
            <script src=""""),_display_(/*125.27*/routes/*125.33*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*125.93*/(""""></script>

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
                  DATE: Wed Mar 11 16:44:03 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/project.scala.html
                  HASH: 82742b8cd15fe883e5c6583622252ead88b2c581
                  MATRIX: 740->1|881->54|913->60|984->105|1002->115|1039->132|1074->141|1171->212|1224->245|1269->262|1341->307|1358->315|1416->352|1465->373|1776->656|1792->662|1846->694|2338->1159|2390->1202|2429->1203|2469->1212|2918->1633|2975->1680|3015->1681|3056->1690|3099->1705|3119->1715|3173->1747|3378->1925|3432->1970|3493->1992|3562->2034|3605->2061|3644->2062|3717->2107|4097->2460|4196->2549|4245->2559|4334->2620|4535->2794|4571->2821|4611->2823|4712->2896|5080->3233|5177->3303|5217->3333|5258->3335|5359->3408|5719->3737|5816->3807|5852->3834|5892->3836|5993->3909|6357->4242|6450->4307|6810->4639|6822->4641|6849->4646|6950->4720|6987->4747|7028->4749|7051->4753|7065->4758|7105->4759|7139->4761|7169->4762|7201->4766|7227->4770|7784->5299|7800->5305|7853->5336|8458->5913|8474->5919|8527->5950|9160->6552|9241->6605|9425->6758|9494->6796|9555->6829|9702->6949|9730->6968|9770->6970|9823->6996|9840->7004|9897->7040|9950->7066|9967->7074|10025->7111|10066->7133|10079->7137|10118->7138|10171->7163|10611->7572|10656->7589|10756->7684|10797->7698|10814->7706|10858->7741|10875->7749|10913->7778|10953->7780|11002->7801|11426->8197|11446->8207|11481->8232|11526->8238|11580->8263|11718->8372|11730->8373|11760->8380|11899->8490|11911->8491|11939->8496|12078->8606|12090->8607|12151->8645|12240->8702|12290->8723|12369->8770|12411->8783|12746->9090|12762->9096|12823->9135|12961->9245|12977->9251|13059->9311
                  LINES: 26->1|29->1|31->3|33->5|33->5|33->5|34->6|37->9|37->9|38->10|39->11|39->11|39->11|40->12|43->15|43->15|43->15|50->22|50->22|50->22|50->22|55->27|55->27|55->27|55->27|55->27|55->27|55->27|57->29|57->29|57->29|58->30|58->30|58->30|59->31|62->34|62->34|62->34|63->35|65->37|65->37|65->37|66->38|69->41|70->42|70->42|70->42|71->43|74->46|75->47|75->47|75->47|76->48|79->51|80->52|83->55|83->55|83->55|84->56|84->56|84->56|84->56|84->56|84->56|84->56|84->56|84->56|84->56|89->61|89->61|89->61|94->66|94->66|94->66|101->73|102->74|105->77|106->78|107->79|111->83|111->83|111->83|112->84|112->84|112->84|113->85|113->85|113->85|114->86|114->86|114->86|115->87|122->94|123->95|125->97|126->98|126->98|126->98|126->98|126->98|126->98|127->99|137->109|137->109|137->109|137->109|138->110|139->111|139->111|139->111|140->112|140->112|140->112|141->113|141->113|141->113|143->115|144->116|146->118|147->119|151->123|151->123|151->123|153->125|153->125|153->125
                  -- GENERATED --
              */
          