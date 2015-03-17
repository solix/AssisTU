
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
object projectNavBar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Person,Project,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentUser: Person, project: Project):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.41*/("""
"""),format.raw/*2.1*/("""<div class="container-fluid" style="text-align: center; margin: 1% 0">
    <div role="tabpanel">
        <ul class="nav nav-tabs">
            """),_display_(/*5.14*/for(p <- PersonData.findActiveProjects) yield /*5.53*/ {_display_(Seq[Any](format.raw/*5.55*/("""
                """),_display_(/*6.18*/if(project != null)/*6.37*/{_display_(Seq[Any](format.raw/*6.38*/("""
                    """),_display_(/*7.22*/if(p.id == project.id)/*7.44*/ {_display_(Seq[Any](format.raw/*7.46*/("""
                        """),format.raw/*8.25*/("""<li role="presentation" class="active" style="width: 18%; text-overflow : ellipsis ; overflow : hidden ; white-space : nowrap">
                            <a href="#project"""),_display_(/*9.47*/p/*9.48*/.id),format.raw/*9.51*/("""" data-toggle="tab">"""),_display_(/*9.72*/p/*9.73*/.folder),format.raw/*9.80*/("""</a>
                        </li>
                    """)))}/*11.23*/else/*11.28*/{_display_(Seq[Any](format.raw/*11.29*/("""
                        """),format.raw/*12.25*/("""<li role="presentation" style="width: 18%; overflow: hidden; white-space: nowrap ; text-overflow : ellipsis">
                            <a href="#project"""),_display_(/*13.47*/p/*13.48*/.id),format.raw/*13.51*/("""" data-toggle="tab">"""),_display_(/*13.72*/p/*13.73*/.folder),format.raw/*13.80*/("""</a>
                        </li>
                    """)))}),format.raw/*15.22*/("""
                """)))}/*16.19*/else/*16.24*/{_display_(Seq[Any](format.raw/*16.25*/("""
                    """),_display_(/*17.22*/if(p.id == PersonData.getLastUsedProject.id)/*17.66*/ {_display_(Seq[Any](format.raw/*17.68*/("""
                        """),format.raw/*18.25*/("""<li role="presentation" class="active" style="width : 18% ; text-overflow : ellipsis ; overflow : hidden ; white-space : nowrap">
                            <a href="#project"""),_display_(/*19.47*/p/*19.48*/.id),format.raw/*19.51*/("""" data-toggle="tab">"""),_display_(/*19.72*/p/*19.73*/.folder),format.raw/*19.80*/("""</a>
                        </li>
                    """)))}/*21.23*/else/*21.28*/{_display_(Seq[Any](format.raw/*21.29*/("""
                        """),format.raw/*22.25*/("""<li role="presentation" style="width : 18% ; overflow : hidden ; white-space : nowrap ; text-overflow : ellipsis">
                            <a href="#project"""),_display_(/*23.47*/p/*23.48*/.id),format.raw/*23.51*/("""" data-toggle="tab">"""),_display_(/*23.72*/p/*23.73*/.folder),format.raw/*23.80*/("""</a>
                        </li>
                    """)))}),format.raw/*25.22*/("""
                """)))}),format.raw/*26.18*/("""
            """)))}),format.raw/*27.14*/("""
        """),format.raw/*28.9*/("""</ul>
    </div>
</div>
"""))}
  }

  def render(currentUser:Person,project:Project): play.twirl.api.HtmlFormat.Appendable = apply(currentUser,project)

  def f:((Person,Project) => play.twirl.api.HtmlFormat.Appendable) = (currentUser,project) => apply(currentUser,project)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:16 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/projects/projectNavBar.scala.html
                  HASH: 39c4d4256ea54ae644fa6a6e04a5e2a31cba5ffd
                  MATRIX: 748->1|875->40|902->41|1072->185|1126->224|1165->226|1209->244|1236->263|1274->264|1322->286|1352->308|1391->310|1443->335|1643->509|1652->510|1675->513|1722->534|1731->535|1758->542|1833->599|1846->604|1885->605|1938->630|2121->786|2131->787|2155->790|2203->811|2213->812|2241->819|2328->875|2365->894|2378->899|2417->900|2466->922|2519->966|2559->968|2612->993|2815->1169|2825->1170|2849->1173|2897->1194|2907->1195|2935->1202|3010->1259|3023->1264|3062->1265|3115->1290|3303->1451|3313->1452|3337->1455|3385->1476|3395->1477|3423->1484|3510->1540|3559->1558|3604->1572|3640->1581
                  LINES: 26->1|29->1|30->2|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|36->8|37->9|37->9|37->9|37->9|37->9|37->9|39->11|39->11|39->11|40->12|41->13|41->13|41->13|41->13|41->13|41->13|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|47->19|47->19|47->19|47->19|47->19|47->19|49->21|49->21|49->21|50->22|51->23|51->23|51->23|51->23|51->23|51->23|53->25|54->26|55->27|56->28
                  -- GENERATED --
              */
          