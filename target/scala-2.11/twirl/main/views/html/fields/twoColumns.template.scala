
package views.html.fields

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
object twoColumns extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[helper.FieldElements,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elements: helper.FieldElements):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*3.1*/("""<div class="row" id="rowOf_"""),_display_(/*3.29*/elements/*3.37*/.id),format.raw/*3.40*/("""">

    <div class="span2"><label for=""""),_display_(/*5.37*/elements/*5.45*/.id),format.raw/*5.48*/("""">"""),_display_(/*5.51*/elements/*5.59*/.label),format.raw/*5.65*/("""</label></div>

    <div class="span8">
        <div class=""""),_display_(/*8.22*/if(elements.hasErrors)/*8.44*/ {_display_(Seq[Any](format.raw/*8.46*/("""error""")))}),format.raw/*8.52*/("""">
            <div class="input">
                """),_display_(/*10.18*/elements/*10.26*/.input),format.raw/*10.32*/("""
                """),format.raw/*11.17*/("""<label for=""""),_display_(/*11.30*/elements/*11.38*/.id),format.raw/*11.41*/("""" generated="true" class="error">"""),_display_(/*11.75*/elements/*11.83*/.errors.mkString(", ")),format.raw/*11.105*/("""</label>
            </div>
        </div>
    </div>
</div>"""))}
  }

  def render(elements:helper.FieldElements): play.twirl.api.HtmlFormat.Appendable = apply(elements)

  def f:((helper.FieldElements) => play.twirl.api.HtmlFormat.Appendable) = (elements) => apply(elements)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/fields/twoColumns.scala.html
                  HASH: 143b1c32156040ccbaa36957c1ecd66123abc601
                  MATRIX: 749->1|869->33|897->35|951->63|967->71|990->74|1056->114|1072->122|1095->125|1124->128|1140->136|1166->142|1253->203|1283->225|1322->227|1358->233|1437->285|1454->293|1481->299|1526->316|1566->329|1583->337|1607->340|1668->374|1685->382|1729->404
                  LINES: 26->1|29->1|31->3|31->3|31->3|31->3|33->5|33->5|33->5|33->5|33->5|33->5|36->8|36->8|36->8|36->8|38->10|38->10|38->10|39->11|39->11|39->11|39->11|39->11|39->11|39->11
                  -- GENERATED --
              */
          