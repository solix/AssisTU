
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
object currentAuth extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[_root_.scala.Function1[plugins.com.feth.play.module.pa.user.AuthUser, play.twirl.api.Html],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(body: plugins.com.feth.play.module.pa.user.AuthUser => play.twirl.api.Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import plugins.com.feth.play.module.pa.PlayAuthenticate
import plugins.com.feth.play.module.pa.PlayAuthenticate
import plugins.com.feth.play.module.pa.user.AuthUser

Seq[Any](format.raw/*1.80*/("""
"""),format.raw/*5.1*/("""

"""),_display_(/*7.2*/defining(PlayAuthenticate.getUser(session()))/*7.47*/ { auth =>_display_(Seq[Any](format.raw/*7.57*/("""
	"""),_display_(/*8.3*/body(auth)),format.raw/*8.13*/("""
""")))}),format.raw/*9.2*/("""
"""))}
  }

  def render(body:_root_.scala.Function1[plugins.com.feth.play.module.pa.user.AuthUser, play.twirl.api.Html]): play.twirl.api.HtmlFormat.Appendable = apply()(body)

  def f:(() => (_root_.scala.Function1[plugins.com.feth.play.module.pa.user.AuthUser, play.twirl.api.Html]) => play.twirl.api.HtmlFormat.Appendable) = () => (body) => apply()(body)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:03 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/plugins/com/feth/play/module/pa/views/currentAuth.scala.html
                  HASH: 2db31bc3a56eee7b6e673230114a496b4aa6daea
                  MATRIX: 845->1|1175->79|1202->248|1230->251|1283->296|1330->306|1358->309|1388->319|1419->321
                  LINES: 26->1|31->1|32->5|34->7|34->7|34->7|35->8|35->8|36->9
                  -- GENERATED --
              */
          