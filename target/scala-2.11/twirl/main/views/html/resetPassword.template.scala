
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
object resetPassword extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[controllers.Signup.PasswordReset],Boolean,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(resetForm: Form[controllers.Signup.PasswordReset], info: Boolean, theme: String, message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import plugins.com.feth.play.module.pa.providers.AuthProvider
import plugins.com.feth.play.module.pa.views.html._

Seq[Any](format.raw/*1.100*/("""

    """),format.raw/*4.1*/("""    """),format.raw/*5.1*/("""    """),format.raw/*5.5*/("""<html>
    <head>
        """),_display_(/*7.10*/linkLoader/*7.20*/.loginhead()),format.raw/*7.32*/("""
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
                    """),_display_(/*26.22*/helper/*26.28*/.form(routes.Signup.doResetPassword)/*26.64*/{_display_(Seq[Any](format.raw/*26.65*/("""
                        """),format.raw/*27.25*/("""<input type="hidden" name="token" value=""""),_display_(/*27.67*/resetForm("token")/*27.85*/.value),format.raw/*27.91*/("""">
                        <div class="form-group ">
                            <label class="control-label" for="password">New Password</label>
                            <input autofocus class="form-control input-sm" id="password" name="password" type="password" placeholder="Password">
                            <span class="help-inline" style="font-size: x-small;">Minimum length: 6</span>
                        </div>
                        <div class="form-group ">
                            <label class="control-label" for="password">Repeat New Password</label>
                            <input autofocus class="form-control input-sm" id="repeatPassword" name="repeatPassword" type="password" placeholder="Confirm password">
                            <span class="help-inline" style="font-size: x-small;">Minimum length: 6</span>
                        </div>
                        <div class="controls">
                            <div class="row" style="text-align: center">
                                <div class="col-lg-6">
                                    <a type="button" class="btn btn-sm btn-default center-block" href=""""),_display_(/*41.105*/routes/*41.111*/.Authentication.login),format.raw/*41.132*/(""""
                                    style="width: 100%; min-width: 150px; font-size: 12pt">
                                        Back to login
                                    </a>
                                </div>
                                <div class="col-lg-6">
                                    <button type="submit" class="btn btn-sm btn-primary center-block"
                                    style="width: 100%; min-width: 150px; font-size: 12pt">
                                        Reset Password!
                                    </button>
                                </div>
                            </div>
                        </div>
                    """)))}),format.raw/*54.22*/("""
                """),format.raw/*55.17*/("""</div>
            </div>
        </div>

        <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" ></script>
            <!--bootstrap-->
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

            <!--sb-Admin-->
        <script src=""""),_display_(/*64.23*/routes/*64.29*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*64.68*/(""""></script>

        <script src=""""),_display_(/*66.23*/routes/*66.29*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*66.89*/(""""></script>
        <script src=""""),_display_(/*67.23*/routes/*67.29*/.Assets.at("javascripts.js")),format.raw/*67.57*/(""""></script>

    </body>
</html>
"""))}
  }

  def render(resetForm:Form[controllers.Signup.PasswordReset],info:Boolean,theme:String,message:String): play.twirl.api.HtmlFormat.Appendable = apply(resetForm,info,theme,message)

  def f:((Form[controllers.Signup.PasswordReset],Boolean,String,String) => play.twirl.api.HtmlFormat.Appendable) = (resetForm,info,theme,message) => apply(resetForm,info,theme,message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/resetPassword.scala.html
                  HASH: d1f4ef234e4dbc0fc8af7189478b448851c16b53
                  MATRIX: 785->1|1085->99|1117->168|1147->225|1177->229|1230->256|1248->266|1280->278|1311->283|1999->944|2016->952|2056->954|2109->980|2126->988|2169->1010|2222->1032|2271->1054|2286->1060|2331->1096|2370->1097|2423->1122|2492->1164|2519->1182|2546->1188|3735->2349|3751->2355|3794->2376|4530->3081|4575->3098|4910->3406|4925->3412|4985->3451|5047->3486|5062->3492|5143->3552|5204->3586|5219->3592|5268->3620
                  LINES: 26->1|30->1|32->4|32->5|32->5|34->7|34->7|34->7|35->8|50->23|50->23|50->23|51->24|51->24|51->24|52->25|53->26|53->26|53->26|53->26|54->27|54->27|54->27|54->27|68->41|68->41|68->41|81->54|82->55|91->64|91->64|91->64|93->66|93->66|93->66|94->67|94->67|94->67
                  -- GENERATED --
              */
          