
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
object login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Boolean,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[_],info: Boolean, theme:String, message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import plugins.com.feth.play.module.pa.providers.AuthProvider

Seq[Any](format.raw/*1.67*/("""
"""),format.raw/*3.1*/("""    """),format.raw/*3.5*/("""<html>
    <head>
        """),_display_(/*5.10*/linkLoader/*5.20*/.loginhead()),format.raw/*5.32*/("""
    """),format.raw/*6.5*/("""</head>
    <body>
        <div class="container">
            <a href="https://github.com/you"><img style="position: absolute; top: 0; right: 0; border: 0;" src="https://camo.githubusercontent.com/a6677b08c955af8400f44c6298f40e7d19cc5b2d/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f6769746875622f726962626f6e732f666f726b6d655f72696768745f677261795f3664366436642e706e67" alt="Fork me on GitHub" data-canonical-src="https://s3.amazonaws.com/github/ribbons/forkme_right_gray_6d6d6d.png"></a>
            <div class="page-header">
                <div class="container-fluid ">
                    <div class="row" style="font-size: 32pt; text-align: center;">
                        <p style="margin-bottom: 0"><i class="fa fa-sign-in"></i></p>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3">
                    """),_display_(/*19.22*/if(info)/*19.30*/ {_display_(Seq[Any](format.raw/*19.32*/("""
                        """),_display_(/*20.26*/template/*20.34*/.alert(theme, message)),format.raw/*20.56*/("""
                    """)))}),format.raw/*21.22*/("""
                    """),_display_(/*22.22*/helper/*22.28*/.form(routes.Authentication.doLogin)/*22.64*/{_display_(Seq[Any](format.raw/*22.65*/("""
                        """),format.raw/*23.25*/("""<div class="form-group">
                            <label class="control-label" for="email">Email</label>
                            <input autofocus class="form-control input-sm" id="email" name="email" value=""""),_display_(/*25.108*/loginForm("email")/*25.126*/.value),format.raw/*25.132*/("""" type="email" placeholder="Email">
                        </div>
                        <div class="form-group ">
                            <label class="control-label" for="password">Password</label>
                            <input autofocus class="form-control input-sm" id="password" name="password" type="password" placeholder="Password">
                            <a class="pull-right" href=""""),_display_(/*30.58*/routes/*30.64*/.Signup.forgotPassword),format.raw/*30.86*/("""">I forgot my password</a>
                        </div>
                        <br>
                        <div class="controls">
                            <button type="submit" class="btn btn-sm btn-success center-block btn-loading" data-loading-text="Signing in.."
                            style="width: 80%; min-width: 250px; font-size: 12pt">
                                Sign in
                            </button>
                        </div>
                    """)))}),format.raw/*39.22*/("""
                    """),format.raw/*40.21*/("""<br>
                    <p>Don't have an account here yet? You can <a href=""""),_display_(/*41.74*/routes/*41.80*/.Authentication.signup),format.raw/*41.102*/("""">create an account here</a>.</p>
                    <legend class="text-muted text-center">Or log in with</legend>
                    <div class="row" style="text-align: center">
                        <a class="btn btn-lg btn-social-icon btn-google-plus" style="width: 75px; height: 75px;"
                        href=""""),_display_(/*45.32*/AuthProvider/*45.44*/.Registry.get("google").getUrl()),format.raw/*45.76*/("""" title="Sign in with Google" rel="nofollow">
                            <img src=""""),_display_(/*46.40*/routes/*46.46*/.Assets.at("icons/googleplus-64.png")),format.raw/*46.83*/("""">
                        </a>
                        <br><br>
                        <label>Google</label>
                        """),format.raw/*50.78*/("""
                            """),format.raw/*51.118*/("""
                            """),format.raw/*52.133*/("""
                                """),format.raw/*53.91*/("""
                            """),format.raw/*54.37*/("""
                            """),format.raw/*55.41*/("""
                            """),format.raw/*56.56*/("""
                        """),format.raw/*57.35*/("""
                    """),format.raw/*58.21*/("""</div>
                </div>
            </div>
        </div>

    <script type="text/javascript" src="https://apis.google.com/js/plusone.js"></script>
  <script>
    !function(d,s,id)"""),format.raw/*65.22*/("""{"""),format.raw/*65.23*/("""var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id))"""),format.raw/*65.131*/("""{"""),format.raw/*65.132*/("""js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);"""),format.raw/*65.245*/("""}"""),format.raw/*65.246*/("""}"""),format.raw/*65.247*/("""(document, 'script', 'twitter-wjs');
  </script>
    <script src="/p/min/script/scripts.min.js?1-4-0.379471333572466079"></script>
  <script type="text/javascript" src="https://apis.google.com/js/plusone.js"></script>
  <script>
    !function(d,s,id)"""),format.raw/*70.22*/("""{"""),format.raw/*70.23*/("""var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id))"""),format.raw/*70.131*/("""{"""),format.raw/*70.132*/("""js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);"""),format.raw/*70.245*/("""}"""),format.raw/*70.246*/("""}"""),format.raw/*70.247*/("""(document, 'script', 'twitter-wjs');
  </script>

    <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" ></script>
<!--bootstrap-->
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

<!--sb-Admin-->
<script src=""""),_display_(/*78.15*/routes/*78.21*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*78.60*/(""""></script>

<script src=""""),_display_(/*80.15*/routes/*80.21*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*80.81*/(""""></script>
<script src=""""),_display_(/*81.15*/routes/*81.21*/.Assets.at("javascripts.js")),format.raw/*81.49*/(""""></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tour/0.10.1/js/bootstrap-tour.min.js"></script>
        <script src=""""),_display_(/*83.23*/routes/*83.29*/.Assets.at("javascripts/walkthrough.js")),format.raw/*83.69*/(""""></script>

    </body>
</html>
"""))}
  }

  def render(loginForm:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},info:Boolean,theme:String,message:String): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,info,theme,message)

  def f:((Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Boolean,String,String) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,info,theme,message) => apply(loginForm,info,theme,message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/login.scala.html
                  HASH: 47b50066b7689c1c91ec5b3d06b3122b2d756625
                  MATRIX: 817->1|1031->66|1058->130|1088->134|1141->161|1159->171|1191->183|1222->188|2199->1138|2216->1146|2256->1148|2309->1174|2326->1182|2369->1204|2422->1226|2471->1248|2486->1254|2531->1290|2570->1291|2623->1316|2866->1531|2894->1549|2922->1555|3357->1963|3372->1969|3415->1991|3932->2477|3981->2498|4086->2576|4101->2582|4145->2604|4498->2930|4519->2942|4572->2974|4684->3059|4699->3065|4757->3102|4920->3290|4978->3408|5036->3541|5097->3632|5154->3669|5211->3710|5268->3766|5321->3801|5370->3822|5584->4008|5613->4009|5750->4117|5780->4118|5922->4231|5952->4232|5982->4233|6260->4483|6289->4484|6426->4592|6456->4593|6598->4706|6628->4707|6658->4708|6957->4980|6972->4986|7032->5025|7086->5052|7101->5058|7182->5118|7235->5144|7250->5150|7299->5178|7478->5330|7493->5336|7554->5376
                  LINES: 28->1|31->1|32->3|32->3|34->5|34->5|34->5|35->6|48->19|48->19|48->19|49->20|49->20|49->20|50->21|51->22|51->22|51->22|51->22|52->23|54->25|54->25|54->25|59->30|59->30|59->30|68->39|69->40|70->41|70->41|70->41|74->45|74->45|74->45|75->46|75->46|75->46|79->50|80->51|81->52|82->53|83->54|84->55|85->56|86->57|87->58|94->65|94->65|94->65|94->65|94->65|94->65|94->65|99->70|99->70|99->70|99->70|99->70|99->70|99->70|107->78|107->78|107->78|109->80|109->80|109->80|110->81|110->81|110->81|112->83|112->83|112->83
                  -- GENERATED --
              */
          