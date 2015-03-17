
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
object forProviders extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Boolean,Boolean,Boolean,_root_.scala.Function1[com.feth.play.module.pa.providers.AuthProvider, play.twirl.api.Html],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(skipCurrent: Boolean = false, showInternal: Boolean = false, showExternal: Boolean = true)(body: com.feth.play.module.pa.providers.AuthProvider => play.twirl.api.Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import com.feth.play.module.pa.PlayAuthenticate
import com.feth.play.module.pa.providers.AuthProvider.Registry

Seq[Any](format.raw/*1.170*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/defining(Registry.getProviders())/*6.35*/ { providers =>_display_(Seq[Any](format.raw/*6.50*/("""
	"""),_display_(/*7.3*/if(providers != null && providers.size() > 0)/*7.48*/ {_display_(Seq[Any](format.raw/*7.50*/("""
		"""),_display_(/*8.4*/defining(PlayAuthenticate.isLoggedIn(session()))/*8.52*/ { loggedIn =>_display_(Seq[Any](format.raw/*8.66*/("""
			"""),_display_(/*9.5*/defining(PlayAuthenticate.getUser(session()))/*9.50*/ { auth =>_display_(Seq[Any](format.raw/*9.60*/("""
			    """),_display_(/*10.9*/for(p <- providers) yield /*10.28*/ {_display_(Seq[Any](format.raw/*10.30*/("""
			    	"""),_display_(/*11.10*/if(((showExternal && p.isExternal()) || (showInternal && !p.isExternal())) && (!loggedIn || !skipCurrent || (skipCurrent && (loggedIn && !p.getKey().equals(auth.getProvider())))))/*11.189*/ {_display_(Seq[Any](format.raw/*11.191*/("""
			    		"""),_display_(/*12.11*/body(p)),format.raw/*12.18*/("""
			    	""")))}),format.raw/*13.10*/("""
			    """)))}),format.raw/*14.9*/("""
		    """)))}),format.raw/*15.8*/("""
	    """)))}),format.raw/*16.7*/("""
	""")))}),format.raw/*17.3*/("""
""")))}),format.raw/*18.2*/("""
"""))}
  }

  def render(skipCurrent:Boolean,showInternal:Boolean,showExternal:Boolean,body:_root_.scala.Function1[com.feth.play.module.pa.providers.AuthProvider, play.twirl.api.Html]): play.twirl.api.HtmlFormat.Appendable = apply(skipCurrent,showInternal,showExternal)(body)

  def f:((Boolean,Boolean,Boolean) => (_root_.scala.Function1[com.feth.play.module.pa.providers.AuthProvider, play.twirl.api.Html]) => play.twirl.api.HtmlFormat.Appendable) = (skipCurrent,showInternal,showExternal) => (body) => apply(skipCurrent,showInternal,showExternal)(body)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:14 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/com/feth/play/module/pa/views/forProviders.scala.html
                  HASH: f820c333dcbf11157f261d37ab7a4214cc64a2c8
                  MATRIX: 863->1|1230->169|1258->284|1285->286|1326->319|1378->334|1406->337|1459->382|1498->384|1527->388|1583->436|1634->450|1664->455|1717->500|1764->510|1799->519|1834->538|1874->540|1911->550|2100->729|2141->731|2179->742|2207->749|2248->759|2287->768|2325->776|2362->783|2395->786|2427->788
                  LINES: 26->1|30->1|32->5|33->6|33->6|33->6|34->7|34->7|34->7|35->8|35->8|35->8|36->9|36->9|36->9|37->10|37->10|37->10|38->11|38->11|38->11|39->12|39->12|40->13|41->14|42->15|43->16|44->17|45->18
                  -- GENERATED --
              */
          