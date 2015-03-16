
package views.html

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
object forgotPassword extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Boolean,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signupForm: Form[_], info: Boolean, theme: String, message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import plugins.com.feth.play.module.pa.providers.AuthProvider
import plugins.com.feth.play.module.pa.views.html._

Seq[Any](format.raw/*1.70*/("""

    """),format.raw/*4.1*/("""    """),format.raw/*5.1*/("""    """),format.raw/*5.5*/("""<html>
    <head>
    """),_display_(/*7.6*/linkLoader/*7.16*/.loginhead()),format.raw/*7.28*/("""
    """),format.raw/*8.5*/("""</head>
    <body>
        <div class="container">
            <div class="page-header">
                <div class="container-fluid ">
                    <div class="row" style="font-size: 32pt; text-align: center;">
                        <p style="margin-bottom: 0"><i class="fa fa-user-secret"></i></p>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3">
                    <div class="container-fluid" style="text-align: center">
                        <h4>Password Reset</h4>
                    </div>
                    """),_display_(/*23.22*/if(info)/*23.30*/ {_display_(Seq[Any](format.raw/*23.32*/("""
                        """),_display_(/*24.26*/template/*24.34*/.alert(theme, message)),format.raw/*24.56*/("""
                    """)))}),format.raw/*25.22*/("""
                """),_display_(/*26.18*/helper/*26.24*/.form(routes.Signup.doForgotPassword)/*26.61*/{_display_(Seq[Any](format.raw/*26.62*/("""
                    """),format.raw/*27.21*/("""<div class="form-group">
                        <label class="control-label" for="email">Email</label>
                        <input autofocus class="form-control input-sm" id="email" name="email" type="email" placeholder="E-mail">
                    </div>
                    <p>An email will be sent to your registered emailaccount where you will be able to reset your password.</p>
                    <br>
                    <div class="controls">
                        <div class="row" style="text-align: center">
                            <div class="col-lg-6">
                                <a type="button" class="btn btn-sm btn-default center-block" href=""""),_display_(/*36.101*/routes/*36.107*/.Authentication.login),format.raw/*36.128*/(""""
                                style="width: 100%; min-width: 150px; font-size: 12pt">
                                    Back to login
                                </a>
                            </div>
                            <div class="col-lg-6">
                                <button type="submit" class="btn btn-sm btn-info center-block"
                                style="width: 100%; min-width: 150px; font-size: 12pt">
                                    Reset Password!
                                </button>
                            </div>
                        </div>
                    </div>
                """)))}),format.raw/*49.18*/("""
                """),format.raw/*50.17*/("""</div>
            </div>
        </div>

        <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" ></script>
            <!--bootstrap-->
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

            <!--sb-Admin-->
        <script src=""""),_display_(/*59.23*/routes/*59.29*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*59.68*/(""""></script>

        <script src=""""),_display_(/*61.23*/routes/*61.29*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*61.89*/(""""></script>
        <script src=""""),_display_(/*62.23*/routes/*62.29*/.Assets.at("javascripts.js")),format.raw/*62.57*/(""""></script>

    </body>
</html>
"""))}
  }

  def render(signupForm:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},info:Boolean,theme:String,message:String): play.twirl.api.HtmlFormat.Appendable = apply(signupForm,info,theme,message)

  def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Boolean,String,String) => play.twirl.api.HtmlFormat.Appendable) = (signupForm,info,theme,message) => apply(signupForm,info,theme,message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/forgotPassword.scala.html
                  HASH: 2657cd4b8f5866004f01f29314e5fc70146f6805
                  MATRIX: 826->1|1095->69|1127->138|1157->195|1187->199|1235->222|1253->232|1285->244|1316->249|2004->910|2021->918|2061->920|2114->946|2131->954|2174->976|2227->998|2272->1016|2287->1022|2333->1059|2372->1060|2421->1081|3126->1758|3142->1764|3185->1785|3866->2435|3911->2452|4246->2760|4261->2766|4321->2805|4383->2840|4398->2846|4479->2906|4540->2940|4555->2946|4604->2974
                  LINES: 28->1|32->1|34->4|34->5|34->5|36->7|36->7|36->7|37->8|52->23|52->23|52->23|53->24|53->24|53->24|54->25|55->26|55->26|55->26|55->26|56->27|65->36|65->36|65->36|78->49|79->50|88->59|88->59|88->59|90->61|90->61|90->61|91->62|91->62|91->62
                  -- GENERATED --
              */
          