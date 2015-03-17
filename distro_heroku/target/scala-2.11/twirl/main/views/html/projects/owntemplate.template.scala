
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
object owntemplate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Project,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(p: Project):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.14*/("""
"""),format.raw/*2.1*/("""<div class="alert alert-info" role="alert">

<p><strong>Next step:</strong> upload your own template </p>






        """),_display_(/*11.10*/helper/*11.16*/.form(action = routes.DocumentData.uploadNewTemplate(p.id), 'enctype -> "multipart/form-data")/*11.110*/ {_display_(Seq[Any](format.raw/*11.112*/("""
          """),format.raw/*12.11*/("""<div class="form-inline">
            <div class="form-group">
              <input type="file" name="document" id="js-upload-files" multiple>
            </div>
            <div class="form-group">
              <button type="submit" class="btn btn-sm btn-primary" id="js-upload-submit">ok</button>
            </div>

          </div>
        """)))}),format.raw/*21.10*/("""

  """),format.raw/*23.3*/("""</div>"""))}
  }

  def render(p:Project): play.twirl.api.HtmlFormat.Appendable = apply(p)

  def f:((Project) => play.twirl.api.HtmlFormat.Appendable) = (p) => apply(p)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:16 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/projects/owntemplate.scala.html
                  HASH: 7904008d60a8695a5e561b9b2315d9ef4bbeb4df
                  MATRIX: 739->1|839->13|866->14|1014->135|1029->141|1133->235|1174->237|1213->248|1590->594|1621->598
                  LINES: 26->1|29->1|30->2|39->11|39->11|39->11|39->11|40->12|49->21|51->23
                  -- GENERATED --
              */
          