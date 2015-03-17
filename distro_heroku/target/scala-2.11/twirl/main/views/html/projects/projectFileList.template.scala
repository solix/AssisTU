
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
    """),_display_(/*2.6*/defining(DocumentFile.find.where().eq("project", p).findList())/*2.69*/ { file_list =>_display_(Seq[Any](format.raw/*2.84*/("""
        """),format.raw/*3.9*/("""<!-- Table -->
        """),_display_(/*4.10*/if(file_list.size > 0)/*4.32*/ {_display_(Seq[Any](format.raw/*4.34*/("""
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
                """),_display_(/*15.18*/file_list/*15.27*/.map/*15.31*/ { f =>_display_(Seq[Any](format.raw/*15.38*/("""
                    """),_display_(/*16.22*/if(f.owntemplate.equals(false))/*16.53*/ {_display_(Seq[Any](format.raw/*16.55*/("""
                        """),format.raw/*17.25*/("""<tr>
                            <td>"""),_display_(/*18.34*/f/*18.35*/.name),format.raw/*18.40*/("""</td>
                            <td>"""),_display_(/*19.34*/f/*19.35*/.person.name),format.raw/*19.47*/("""</td>
                            <td style="text-align : center">"""),_display_(/*20.62*/f/*20.63*/.id),format.raw/*20.66*/("""</td>
                            <td style="text-align : center">
                                <a href=""""),_display_(/*22.43*/routes/*22.49*/.DocumentData.downloadDocument(f.id)),format.raw/*22.85*/("""" ><i class="fa fa-download fa-fw"></i></a>
                                |
                                <a href=""""),_display_(/*24.43*/routes/*24.49*/.DocumentData.documentDiscussion(f.id)),format.raw/*24.87*/(""""><i class="fa fa-comment fa-fw"></i></a>
                                """),_display_(/*25.34*/if(f.person.equals(currentUser))/*25.66*/{_display_(Seq[Any](format.raw/*25.67*/("""
                                    """),format.raw/*26.37*/("""|
                                    <a style="color: red" href="#" data-toggle="modal" data-target="#deleteFile"""),_display_(/*27.113*/f/*27.114*/.id),format.raw/*27.117*/(""""><i class="fa fa-close fa-fw"></i></a>
                                """)))}),format.raw/*28.34*/("""
                            """),format.raw/*29.29*/("""</td>
                        </tr>
                    """)))}),format.raw/*31.22*/("""
                """)))}),format.raw/*32.18*/("""

                """),format.raw/*34.17*/("""</tbody>
            </table>
        """)))}),format.raw/*36.10*/("""
        """),_display_(/*37.10*/file_list/*37.19*/.map/*37.23*/ { f =>_display_(Seq[Any](format.raw/*37.30*/("""
            """),format.raw/*38.51*/("""
            """),_display_(/*39.14*/template/*39.22*/.smallmodal("deleteFile" + f.id.toString)/*39.63*/("danger")/*39.73*/("Deleting " + f.name)/*39.95*/ {_display_(Seq[Any](format.raw/*39.97*/("""
                """),format.raw/*40.17*/("""<p style="text-align : center">Are you sure you want to delete """),_display_(/*40.81*/f/*40.82*/.name),format.raw/*40.87*/("""?</p>
                <div class="btn-group col-xs-6" role="group" style="margin : 20 px 0 px 0 px 0 px">
                    <a type="button" class="btn btn-default col-xs-12" data-dismiss="modal">Cancel</a>
                </div>
                <div class="btn-group col-xs-6" role="group" style="margin : 20 px 0 px 0 px 0 px">
                    <a type="submit" class="btn btn-danger col-xs-12" href=""""),_display_(/*45.78*/routes/*45.84*/.DocumentData.deleteDocument(f.id)),format.raw/*45.118*/("""">
                        Delete!</a>
                </div>
            """)))}),format.raw/*48.14*/("""
        """)))}),format.raw/*49.10*/("""
    """)))}),format.raw/*50.6*/("""
"""))}
  }

  def render(currentUser:Person,p:Project): play.twirl.api.HtmlFormat.Appendable = apply(currentUser,p)

  def f:((Person,Project) => play.twirl.api.HtmlFormat.Appendable) = (currentUser,p) => apply(currentUser,p)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:16 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/projects/projectFileList.scala.html
                  HASH: 563f4bd77074a6994948b42ebacf1e9a78ed1eb4
                  MATRIX: 750->1|871->34|902->40|973->103|1025->118|1060->127|1110->151|1140->173|1179->175|1219->188|1713->655|1731->664|1744->668|1789->675|1838->697|1878->728|1918->730|1971->755|2036->793|2046->794|2072->799|2138->838|2148->839|2181->851|2275->918|2285->919|2309->922|2445->1031|2460->1037|2517->1073|2664->1193|2679->1199|2738->1237|2840->1312|2881->1344|2920->1345|2985->1382|3127->1496|3138->1497|3163->1500|3267->1573|3324->1602|3412->1659|3461->1677|3507->1695|3577->1734|3614->1744|3632->1753|3645->1757|3690->1764|3731->1815|3772->1829|3789->1837|3839->1878|3858->1888|3889->1910|3929->1912|3974->1929|4065->1993|4075->1994|4101->1999|4537->2408|4552->2414|4608->2448|4714->2523|4755->2533|4791->2539
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|32->4|32->4|32->4|33->5|43->15|43->15|43->15|43->15|44->16|44->16|44->16|45->17|46->18|46->18|46->18|47->19|47->19|47->19|48->20|48->20|48->20|50->22|50->22|50->22|52->24|52->24|52->24|53->25|53->25|53->25|54->26|55->27|55->27|55->27|56->28|57->29|59->31|60->32|62->34|64->36|65->37|65->37|65->37|65->37|66->38|67->39|67->39|67->39|67->39|67->39|67->39|68->40|68->40|68->40|68->40|73->45|73->45|73->45|76->48|77->49|78->50
                  -- GENERATED --
              */
          