
package com.feth.play.module.pa.views.html

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
object currentAuth extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[_root_.scala.Function1[com.feth.play.module.pa.user.AuthUser, play.twirl.api.Html],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(body: com.feth.play.module.pa.user.AuthUser => play.twirl.api.Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import com.feth.play.module.pa.PlayAuthenticate

Seq[Any](format.raw/*1.72*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/defining(PlayAuthenticate.getUser(session()))/*5.47*/ { auth =>_display_(Seq[Any](format.raw/*5.57*/("""
	"""),_display_(/*6.3*/body(auth)),format.raw/*6.13*/("""
""")))}),format.raw/*7.2*/("""
"""))}
  }

  def render(body:_root_.scala.Function1[com.feth.play.module.pa.user.AuthUser, play.twirl.api.Html]): play.twirl.api.HtmlFormat.Appendable = apply()(body)

  def f:(() => (_root_.scala.Function1[com.feth.play.module.pa.user.AuthUser, play.twirl.api.Html]) => play.twirl.api.HtmlFormat.Appendable) = () => (body) => apply()(body)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:14 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/com/feth/play/module/pa/views/currentAuth.scala.html
                  HASH: 95ba4d369924d50f86c22a3c0aa369471935cdef
                  MATRIX: 829->1|1034->71|1062->122|1089->124|1142->169|1189->179|1217->182|1247->192|1278->194
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|33->6|33->6|34->7
                  -- GENERATED --
              */
          