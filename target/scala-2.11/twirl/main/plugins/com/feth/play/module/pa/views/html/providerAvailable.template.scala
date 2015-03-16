
package plugins.com.feth.play.module.pa.views.html

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
      _display_ {import plugins.com.feth.play.module.pa.providers.AuthProvider
import AuthProvider.Registry

Seq[Any](format.raw/*1.62*/("""
"""),format.raw/*3.1*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/defining(boolean2Boolean(Registry.hasProvider(providerName)))/*6.63*/ { hasProvider: Boolean =>_display_(Seq[Any](format.raw/*6.89*/("""
    """),_display_(/*7.6*/body(hasProvider)),format.raw/*7.23*/("""
""")))}),format.raw/*8.2*/("""
"""))}
  }

  def render(providerName:String,body:_root_.scala.Function1[Boolean, play.twirl.api.Html]): play.twirl.api.HtmlFormat.Appendable = apply(providerName)(body)

  def f:((String) => (_root_.scala.Function1[Boolean, play.twirl.api.Html]) => play.twirl.api.HtmlFormat.Appendable) = (providerName) => (body) => apply(providerName)(body)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:03 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/plugins/com/feth/play/module/pa/views/providerAvailable.scala.html
                  HASH: 1b78d37eac4a351dae3acdd4d42a92ff6e9ab4e8
                  MATRIX: 820->1|1058->61|1085->125|1112->156|1139->158|1208->219|1271->245|1302->251|1339->268|1370->270
                  LINES: 26->1|30->1|31->3|32->5|33->6|33->6|33->6|34->7|34->7|35->8
                  -- GENERATED --
              */
          