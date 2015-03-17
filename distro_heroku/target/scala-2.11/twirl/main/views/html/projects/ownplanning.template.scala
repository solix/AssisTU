
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
object ownplanning extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Person,Project,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(u: Person,p:Project):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.23*/("""
"""),format.raw/*2.1*/("""<div class="alert alert-info" role="alert">

  <p><strong>Next step:</strong> Plan your Entire Project

<span>
    <a href=""""),_display_(/*7.15*/routes/*7.21*/.CalendarData.calendar()),format.raw/*7.45*/("""" class="btn btn-primary " >
        <i class="fa fa-calendar"></i>
    </a>

</span>
  </p>



</div>"""))}
  }

  def render(u:Person,p:Project): play.twirl.api.HtmlFormat.Appendable = apply(u,p)

  def f:((Person,Project) => play.twirl.api.HtmlFormat.Appendable) = (u,p) => apply(u,p)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:16 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/projects/ownplanning.scala.html
                  HASH: ea1394c77da4e5e82c9724dfbd818cedec7a2168
                  MATRIX: 746->1|855->22|882->23|1033->148|1047->154|1091->178
                  LINES: 26->1|29->1|30->2|35->7|35->7|35->7
                  -- GENERATED --
              */
          