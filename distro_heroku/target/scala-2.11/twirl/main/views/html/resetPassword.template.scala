
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
      _display_ {import com.feth.play.module.pa.views.html._
import com.feth.play.module.pa.providers.AuthProvider

Seq[Any](format.raw/*1.100*/("""
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
                    """),_display_(/*25.22*/helper/*25.28*/.form(routes.Signup.doResetPassword)/*25.64*/{_display_(Seq[Any](format.raw/*25.65*/("""
                        """),format.raw/*26.25*/("""<input type="hidden" name="token" value=""""),_display_(/*26.67*/resetForm("token")/*26.85*/.value),format.raw/*26.91*/("""">
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
                                    <a type="button" class="btn btn-sm btn-default center-block" href=""""),_display_(/*40.105*/routes/*40.111*/.Authentication.login),format.raw/*40.132*/(""""
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
                    """)))}),format.raw/*53.22*/("""
                """),format.raw/*54.17*/("""</div>
            </div>
        </div>

        <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" ></script>
            <!--bootstrap-->
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

            <!--sb-Admin-->
        <script src=""""),_display_(/*63.23*/routes/*63.29*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*63.68*/(""""></script>

        <script src=""""),_display_(/*65.23*/routes/*65.29*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*65.89*/(""""></script>
        <script src=""""),_display_(/*66.23*/routes/*66.29*/.Assets.at("javascripts.js")),format.raw/*66.57*/(""""></script>

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
                  DATE: Tue Feb 17 22:25:16 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/resetPassword.scala.html
                  HASH: 59c3eeae6e7fd33fde7fd7f1b6b7084829a82d5d
                  MATRIX: 785->1|1069->99|1096->200|1144->223|1162->233|1194->245|1225->250|1913->911|1930->919|1970->921|2023->947|2040->955|2083->977|2136->999|2185->1021|2200->1027|2245->1063|2284->1064|2337->1089|2406->1131|2433->1149|2460->1155|3649->2316|3665->2322|3708->2343|4444->3048|4489->3065|4824->3373|4839->3379|4899->3418|4961->3453|4976->3459|5057->3519|5118->3553|5133->3559|5182->3587
                  LINES: 26->1|30->1|31->4|33->6|33->6|33->6|34->7|49->22|49->22|49->22|50->23|50->23|50->23|51->24|52->25|52->25|52->25|52->25|53->26|53->26|53->26|53->26|67->40|67->40|67->40|80->53|81->54|90->63|90->63|90->63|92->65|92->65|92->65|93->66|93->66|93->66
                  -- GENERATED --
              */
          