
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
object forProviders extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Boolean,Boolean,Boolean,_root_.scala.Function1[plugins.com.feth.play.module.pa.providers.AuthProvider, play.twirl.api.Html],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(skipCurrent: Boolean = false, showInternal: Boolean = false, showExternal: Boolean = true)(body: plugins.com.feth.play.module.pa.providers.AuthProvider => play.twirl.api.Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import plugins.com.feth.play.module.pa.PlayAuthenticate
import plugins.com.feth.play.module.pa.PlayAuthenticate
import plugins.com.feth.play.module.pa.PlayAuthenticate
import plugins.com.feth.play.module.pa.providers.AuthProvider
import plugins.com.feth.play.module.pa.providers.AuthProvider
import AuthProvider.Registry

Seq[Any](format.raw/*1.178*/("""
"""),format.raw/*7.1*/("""
"""),format.raw/*9.1*/("""
"""),_display_(/*10.2*/defining(Registry.getProviders())/*10.35*/ { providers =>_display_(Seq[Any](format.raw/*10.50*/("""
	"""),_display_(/*11.3*/if(providers != null && providers.size() > 0)/*11.48*/ {_display_(Seq[Any](format.raw/*11.50*/("""
		"""),_display_(/*12.4*/defining(PlayAuthenticate.isLoggedIn(session()))/*12.52*/ { loggedIn =>_display_(Seq[Any](format.raw/*12.66*/("""
			"""),_display_(/*13.5*/defining(PlayAuthenticate.getUser(session()))/*13.50*/ { auth =>_display_(Seq[Any](format.raw/*13.60*/("""
			    """),_display_(/*14.9*/for(p <- providers) yield /*14.28*/ {_display_(Seq[Any](format.raw/*14.30*/("""
			    	"""),_display_(/*15.10*/if(((showExternal && p.isExternal()) || (showInternal && !p.isExternal())) && (!loggedIn || !skipCurrent || (skipCurrent && (loggedIn && !p.getKey().equals(auth.getProvider())))))/*15.189*/ {_display_(Seq[Any](format.raw/*15.191*/("""
			    		"""),_display_(/*16.11*/body(p)),format.raw/*16.18*/("""
			    	""")))}),format.raw/*17.10*/("""
			    """)))}),format.raw/*18.9*/("""
		    """)))}),format.raw/*19.8*/("""
	    """)))}),format.raw/*20.7*/("""
	""")))}),format.raw/*21.3*/("""
""")))}),format.raw/*22.2*/("""
"""))}
  }

  def render(skipCurrent:Boolean,showInternal:Boolean,showExternal:Boolean,body:_root_.scala.Function1[plugins.com.feth.play.module.pa.providers.AuthProvider, play.twirl.api.Html]): play.twirl.api.HtmlFormat.Appendable = apply(skipCurrent,showInternal,showExternal)(body)

  def f:((Boolean,Boolean,Boolean) => (_root_.scala.Function1[plugins.com.feth.play.module.pa.providers.AuthProvider, play.twirl.api.Html]) => play.twirl.api.HtmlFormat.Appendable) = (skipCurrent,showInternal,showExternal) => (body) => apply(skipCurrent,showInternal,showExternal)(body)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:03 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/plugins/com/feth/play/module/pa/views/forProviders.scala.html
                  HASH: 13c7d561422ff5c3f6c50d881793f9caf3048909
                  MATRIX: 879->1|1464->177|1491->475|1518->506|1546->508|1588->541|1641->556|1670->559|1724->604|1764->606|1794->610|1851->658|1903->672|1934->677|1988->722|2036->732|2071->741|2106->760|2146->762|2183->772|2372->951|2413->953|2451->964|2479->971|2520->981|2559->990|2597->998|2634->1005|2667->1008|2699->1010
                  LINES: 26->1|34->1|35->7|36->9|37->10|37->10|37->10|38->11|38->11|38->11|39->12|39->12|39->12|40->13|40->13|40->13|41->14|41->14|41->14|42->15|42->15|42->15|43->16|43->16|44->17|45->18|46->19|47->20|48->21|49->22
                  -- GENERATED --
              */
          