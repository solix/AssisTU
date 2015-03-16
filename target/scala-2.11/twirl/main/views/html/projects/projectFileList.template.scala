
package views.html.projects

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
object projectFileList extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Person,Project,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentUser: Person, p: Project):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.35*/("""
    """),_display_(/*2.6*/defining(S3File.find.where().eq("project", p).findList())/*2.63*/ { uploads =>_display_(Seq[Any](format.raw/*2.76*/("""
        """),format.raw/*3.9*/("""<!-- Table -->
        """),_display_(/*4.10*/if(uploads.size > 0)/*4.30*/ {_display_(Seq[Any](format.raw/*4.32*/("""
            """),format.raw/*5.13*/("""<table class="table table-hover">
                <thead>
                    <tr>
                        <th style="width : 60 %">File</th>
                        <th style="width : 20 %">Uploaded by</th>
                        <th style="text-align : center ; width : 15 %">Version</th>
                        <th style="text-align : center ; width : 5 %">Actions</th>
                    </tr>
                </thead>
                <tbody>
                """),_display_(/*15.18*/uploads/*15.25*/.map/*15.29*/ { upload =>_display_(Seq[Any](format.raw/*15.41*/("""
       """),_display_(/*16.9*/if(upload.owntemplate.equals(false))/*16.45*/ {_display_(Seq[Any](format.raw/*16.47*/("""
                        """),format.raw/*17.25*/("""<tr>
                            <td>"""),_display_(/*18.34*/upload/*18.40*/.name),format.raw/*18.45*/("""</td>
                            <td>"""),_display_(/*19.34*/upload/*19.40*/.person.name),format.raw/*19.52*/("""</td>
                            <td style="text-align : center">"""),_display_(/*20.62*/upload/*20.68*/.version),format.raw/*20.76*/("""</td>
                            <td style="text-align : center">
                                <a href=""""),_display_(/*22.43*/upload/*22.49*/.getUrl),format.raw/*22.56*/("""" ><i class="fa fa-download fa-fw"></i></a>
                                |
                          <a href=""""),_display_(/*24.37*/routes/*24.43*/.DocumentData.documentDiscussion(upload.id)),format.raw/*24.86*/(""""><i class="fa fa-comment fa-fw"></i></a>
                            """),_display_(/*25.30*/if(upload.person.equals(currentUser))/*25.67*/{_display_(Seq[Any](format.raw/*25.68*/("""
                                    """),format.raw/*26.37*/("""|
                                    <a style="color: red" href="#" data-toggle="modal" data-target="#deleteFile"""),_display_(/*27.113*/upload/*27.119*/.id.version()),format.raw/*27.132*/(""""><i class="fa fa-close fa-fw"></i></a>
                              """)))}),format.raw/*28.32*/("""
                            """),format.raw/*29.29*/("""</td>
                        </tr>
                    """)))}),format.raw/*31.22*/("""
                """)))}),format.raw/*32.18*/("""
                """),format.raw/*33.17*/("""</tbody>
            </table>
        """)))}),format.raw/*35.10*/("""
        """),_display_(/*36.10*/uploads/*36.17*/.map/*36.21*/ { f =>_display_(Seq[Any](format.raw/*36.28*/("""
            """),format.raw/*37.51*/("""
           """),_display_(/*38.13*/template/*38.21*/.smallmodal("deleteFile" + f.id.version())/*38.63*/("danger")/*38.73*/("Deleting " + f.name)/*38.95*/ {_display_(Seq[Any](format.raw/*38.97*/("""
                """),format.raw/*39.17*/("""<p style="text-align : center">Are you sure you want to delete """),_display_(/*39.81*/f/*39.82*/.name),format.raw/*39.87*/("""?</p>
                <div class="btn-group col-xs-6" role="group" style="margin : 20 px 0 px 0 px 0 px">
                   <a type="button" class="btn btn-default col-xs-12" data-dismiss="modal">Cancel</a>
                </div>
                <div class="btn-group col-xs-6" role="group" style="margin : 20 px 0 px 0 px 0 px">
                    <a type="submit" class="btn btn-danger col-xs-12" href=""""),_display_(/*44.78*/routes/*44.84*/.DocumentData.deleteDocument(f.id)),format.raw/*44.118*/("""">
                        Delete!</a>
                </div>
           """)))}),format.raw/*47.13*/("""
        """)))}),format.raw/*48.10*/("""
    """)))}),format.raw/*49.6*/("""
"""))}
  }

  def render(currentUser:Person,p:Project): play.twirl.api.HtmlFormat.Appendable = apply(currentUser,p)

  def f:((Person,Project) => play.twirl.api.HtmlFormat.Appendable) = (currentUser,p) => apply(currentUser,p)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/projects/projectFileList.scala.html
                  HASH: d208018c33d50b6186fb6eb5f4665783136e3ab7
                  MATRIX: 750->1|871->34|902->40|967->97|1017->110|1052->119|1102->143|1130->163|1169->165|1209->178|1703->645|1719->652|1732->656|1782->668|1817->677|1862->713|1902->715|1955->740|2020->778|2035->784|2061->789|2127->828|2142->834|2175->846|2269->913|2284->919|2313->927|2449->1036|2464->1042|2492->1049|2633->1163|2648->1169|2712->1212|2810->1283|2856->1320|2895->1321|2960->1358|3102->1472|3118->1478|3153->1491|3255->1562|3312->1591|3400->1648|3449->1666|3494->1683|3564->1722|3601->1732|3617->1739|3630->1743|3675->1750|3716->1801|3756->1814|3773->1822|3824->1864|3843->1874|3874->1896|3914->1898|3959->1915|4050->1979|4060->1980|4086->1985|4521->2393|4536->2399|4592->2433|4697->2507|4738->2517|4774->2523
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|32->4|32->4|32->4|33->5|43->15|43->15|43->15|43->15|44->16|44->16|44->16|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|50->22|50->22|50->22|52->24|52->24|52->24|53->25|53->25|53->25|54->26|55->27|55->27|55->27|56->28|57->29|59->31|60->32|61->33|63->35|64->36|64->36|64->36|64->36|65->37|66->38|66->38|66->38|66->38|66->38|66->38|67->39|67->39|67->39|67->39|72->44|72->44|72->44|75->47|76->48|77->49
                  -- GENERATED --
              */
          