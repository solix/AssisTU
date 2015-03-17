
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
      _display_ {import com.feth.play.module.pa.views.html._
import com.feth.play.module.pa.providers.AuthProvider

Seq[Any](format.raw/*1.70*/("""
"""),format.raw/*4.1*/("""<html>
    <head>
    """),_display_(/*6.6*/linkLoader/*6.16*/.loginhead()),format.raw/*6.28*/("""
    """),format.raw/*7.5*/("""</head>
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
                    """),_display_(/*22.22*/if(info)/*22.30*/ {_display_(Seq[Any](format.raw/*22.32*/("""
                        """),_display_(/*23.26*/template/*23.34*/.alert(theme, message)),format.raw/*23.56*/("""
                    """)))}),format.raw/*24.22*/("""
                """),_display_(/*25.18*/helper/*25.24*/.form(routes.Signup.doForgotPassword)/*25.61*/{_display_(Seq[Any](format.raw/*25.62*/("""
                    """),format.raw/*26.21*/("""<div class="form-group">
                        <label class="control-label" for="email">Email</label>
                        <input autofocus class="form-control input-sm" id="email" name="email" type="email" placeholder="E-mail">
                    </div>
                    <p>An email will be sent to your registered emailaccount where you will be able to reset your password.</p>
                    <br>
                    <div class="controls">
                        <div class="row" style="text-align: center">
                            <div class="col-lg-6">
                                <a type="button" class="btn btn-sm btn-default center-block" href=""""),_display_(/*35.101*/routes/*35.107*/.Authentication.login),format.raw/*35.128*/(""""
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
                """)))}),format.raw/*48.18*/("""
                """),format.raw/*49.17*/("""</div>
            </div>
        </div>

        <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" ></script>
            <!--bootstrap-->
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

            <!--sb-Admin-->
        <script src=""""),_display_(/*58.23*/routes/*58.29*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*58.68*/(""""></script>

        <script src=""""),_display_(/*60.23*/routes/*60.29*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*60.89*/(""""></script>
        <script src=""""),_display_(/*61.23*/routes/*61.29*/.Assets.at("javascripts.js")),format.raw/*61.57*/(""""></script>

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
                  DATE: Tue Feb 17 22:25:15 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/forgotPassword.scala.html
                  HASH: 167b50850a8f7091ab329f1068fda6109ead2436
                  MATRIX: 826->1|1079->69|1106->170|1154->193|1172->203|1204->215|1235->220|1923->881|1940->889|1980->891|2033->917|2050->925|2093->947|2146->969|2191->987|2206->993|2252->1030|2291->1031|2340->1052|3045->1729|3061->1735|3104->1756|3785->2406|3830->2423|4165->2731|4180->2737|4240->2776|4302->2811|4317->2817|4398->2877|4459->2911|4474->2917|4523->2945
                  LINES: 28->1|32->1|33->4|35->6|35->6|35->6|36->7|51->22|51->22|51->22|52->23|52->23|52->23|53->24|54->25|54->25|54->25|54->25|55->26|64->35|64->35|64->35|77->48|78->49|87->58|87->58|87->58|89->60|89->60|89->60|90->61|90->61|90->61
                  -- GENERATED --
              */
          