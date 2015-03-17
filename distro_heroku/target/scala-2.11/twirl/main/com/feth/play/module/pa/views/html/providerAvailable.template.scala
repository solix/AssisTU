
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
object providerAvailable extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,_root_.scala.Function1[Boolean, play.twirl.api.Html],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(providerName: String)(body: Boolean => play.twirl.api.Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import com.feth.play.module.pa.providers.AuthProvider.Registry

Seq[Any](format.raw/*1.62*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/defining(boolean2Boolean(Registry.hasProvider(providerName)))/*5.63*/ { hasProvider: Boolean =>_display_(Seq[Any](format.raw/*5.89*/("""
    """),_display_(/*6.6*/body(hasProvider)),format.raw/*6.23*/("""
""")))}),format.raw/*7.2*/("""
"""))}
  }

  def render(providerName:String,body:_root_.scala.Function1[Boolean, play.twirl.api.Html]): play.twirl.api.HtmlFormat.Appendable = apply(providerName)(body)

  def f:((String) => (_root_.scala.Function1[Boolean, play.twirl.api.Html]) => play.twirl.api.HtmlFormat.Appendable) = (providerName) => (body) => apply(providerName)(body)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:14 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/com/feth/play/module/pa/views/providerAvailable.scala.html
                  HASH: 424c1f6e8d7093a7fc21d21b988ac2f850176025
                  MATRIX: 812->1|1022->61|1050->127|1077->129|1146->190|1209->216|1240->222|1277->239|1308->241
                  LINES: 26->1|29->1|31->4|32->5|32->5|32->5|33->6|33->6|34->7
                  -- GENERATED --
              */
          