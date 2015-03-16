
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
object alert extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(theme: String, message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.34*/("""
"""),format.raw/*2.1*/("""<div class="alert alert-"""),_display_(/*2.26*/theme),format.raw/*2.31*/("""" role="alert" style="text-align: center">
    """),_display_(/*3.6*/message),format.raw/*3.13*/("""
"""),format.raw/*4.1*/("""</div>"""))}
  }

  def render(theme:String,message:String): play.twirl.api.HtmlFormat.Appendable = apply(theme,message)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (theme,message) => apply(theme,message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/template/alert.scala.html
                  HASH: 1fc8dd7730259cc84ccd80a5b2d409292739b570
                  MATRIX: 739->1|859->33|886->34|937->59|962->64|1035->112|1062->119|1089->120
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|31->3|32->4
                  -- GENERATED --
              */
          