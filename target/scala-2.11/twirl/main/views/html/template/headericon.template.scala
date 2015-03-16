
package views.html.template

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
object headericon extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(icon: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.16*/("""
"""),format.raw/*2.1*/("""<div class="container-fluid ">
    <div class="row">
        <div class="col-lg-12" style="text-align: center; margin-top: 10px">
            <i class=""""),_display_(/*5.24*/icon),format.raw/*5.28*/("""" style="font-size: 30pt"></i>
        </div>
    </div>
    <hr class="hr" style="margin-top: 10px">
</div>"""))}
  }

  def render(icon:String): play.twirl.api.HtmlFormat.Appendable = apply(icon)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (icon) => apply(icon)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/template/headericon.scala.html
                  HASH: e2d5b5db938da4744131d76dce05d5b8230a32a1
                  MATRIX: 737->1|839->15|866->16|1045->169|1069->173
                  LINES: 26->1|29->1|30->2|33->5|33->5
                  -- GENERATED --
              */
          