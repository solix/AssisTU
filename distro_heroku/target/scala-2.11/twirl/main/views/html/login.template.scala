
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
      _display_ {import com.feth.play.module.pa.views.html._
import com.feth.play.module.pa.providers.AuthProvider

Seq[Any](format.raw/*1.67*/("""
"""),format.raw/*4.1*/("""<html>
    <head>
        """),_display_(/*6.10*/linkLoader/*6.20*/.loginhead()),format.raw/*6.32*/("""
    """),format.raw/*7.5*/("""</head>

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
                    """),_display_(/*21.22*/if(info)/*21.30*/ {_display_(Seq[Any](format.raw/*21.32*/("""
                        """),_display_(/*22.26*/template/*22.34*/.alert(theme, message)),format.raw/*22.56*/("""
                    """)))}),format.raw/*23.22*/("""
                    """),_display_(/*24.22*/helper/*24.28*/.form(routes.Authentication.doLogin)/*24.64*/{_display_(Seq[Any](format.raw/*24.65*/("""
                        """),format.raw/*25.25*/("""<div class="form-group">
                            <label class="control-label" for="email">Email</label>
                            <input autofocus class="form-control input-sm" id="email" name="email" value=""""),_display_(/*27.108*/loginForm("email")/*27.126*/.value),format.raw/*27.132*/("""" type="email" placeholder="Email">
                        </div>
                        <div class="form-group ">
                            <label class="control-label pull-left" for="password">Password</label><a class="pull-right" href=""""),_display_(/*30.128*/routes/*30.134*/.Signup.forgotPassword),format.raw/*30.156*/("""">I forgot my password</a>
                            <input autofocus class="form-control input-sm" id="password" name="password" type="password" placeholder="Password">
                        </div>
                        <br>
                        <div class="controls">
                            <button type="submit" class="btn btn-sm btn-success center-block btn-loading" data-loading-text="Signing in.."
                            style="width: 80%; min-width: 250px; font-size: 12pt">
                                Sign in
                            </button>
                        </div>
                  """),format.raw/*40.47*/("""
                    """),format.raw/*41.88*/("""
                      """),format.raw/*42.108*/("""
                      """),format.raw/*43.98*/("""
                    """),format.raw/*44.31*/("""
                  """),format.raw/*45.29*/("""
                    """)))}),format.raw/*46.22*/("""
                    """),format.raw/*47.21*/("""<br>
                    <p>Don't have an account here yet? You can <a href=""""),_display_(/*48.74*/routes/*48.80*/.Authentication.signup),format.raw/*48.102*/("""">create an account here</a>.</p>
                    <legend class="text-muted text-center">Or log in with</legend>
                    <div class="row">
                        <div class="col-sm-6" style="text-align: center">
                            <a class="btn btn-lg btn-social-icon btn-google-plus" style="width: 75px; height: 75px;"
                            href=""""),_display_(/*53.36*/AuthProvider/*53.48*/.Registry.get("google").getUrl()),format.raw/*53.80*/("""" title="Sign in with Google" rel="nofollow">
                                <img src=""""),_display_(/*54.44*/routes/*54.50*/.Assets.at("icons/googleplus-64.png")),format.raw/*54.87*/("""">
                            </a>
                            <br><br>
                            <label>Google</label>
                        </div>
                        <div class="col-sm-6" style="text-align: center">
                            <a class="btn btn-lg btn-social-icon btn-mendeley" style="width: 75px; height: 75px;"
                            href=""""),_display_(/*61.36*/AuthProvider/*61.48*/.Registry.get("mendeley").getUrl()),format.raw/*61.82*/("""" title="Sign in with Mendeley" rel="nofollow">
                                <img src=""""),_display_(/*62.44*/routes/*62.50*/.Assets.at("icons/mendeley-64.png")),format.raw/*62.85*/("""">
                            </a>
                            <br><br>
                            <label>Mendeley</label>
                        </div>
                    </div>
                    """),format.raw/*68.50*/("""
                """),format.raw/*69.171*/("""
                    """),format.raw/*70.58*/("""
                """),format.raw/*71.25*/("""
                """),format.raw/*72.175*/("""
                    """),format.raw/*73.64*/("""
                """),format.raw/*74.25*/("""
                """),format.raw/*75.17*/("""</div>
            </div>
        </div>

    <script type="text/javascript" src="https://apis.google.com/js/plusone.js"></script>
  <script>
    !function(d,s,id)"""),format.raw/*81.22*/("""{"""),format.raw/*81.23*/("""var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id))"""),format.raw/*81.131*/("""{"""),format.raw/*81.132*/("""js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);"""),format.raw/*81.245*/("""}"""),format.raw/*81.246*/("""}"""),format.raw/*81.247*/("""(document, 'script', 'twitter-wjs');
  </script>
    <script src="/p/min/script/scripts.min.js?1-4-0.379471333572466079"></script>
  <script type="text/javascript" src="https://apis.google.com/js/plusone.js"></script>
  <script>
    !function(d,s,id)"""),format.raw/*86.22*/("""{"""),format.raw/*86.23*/("""var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id))"""),format.raw/*86.131*/("""{"""),format.raw/*86.132*/("""js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);"""),format.raw/*86.245*/("""}"""),format.raw/*86.246*/("""}"""),format.raw/*86.247*/("""(document, 'script', 'twitter-wjs');
  </script>

    <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" ></script>
<!--bootstrap-->
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

<!--sb-Admin-->
<script src=""""),_display_(/*94.15*/routes/*94.21*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*94.60*/(""""></script>

<script src=""""),_display_(/*96.15*/routes/*96.21*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*96.81*/(""""></script>
<script src=""""),_display_(/*97.15*/routes/*97.21*/.Assets.at("javascripts.js")),format.raw/*97.49*/(""""></script>

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
                  DATE: Tue Feb 17 22:25:16 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/login.scala.html
                  HASH: a94599feced878814046277831747256dc94f907
                  MATRIX: 817->1|1067->66|1094->167|1147->194|1165->204|1197->216|1228->221|2206->1172|2223->1180|2263->1182|2316->1208|2333->1216|2376->1238|2429->1260|2478->1282|2493->1288|2538->1324|2577->1325|2630->1350|2873->1565|2901->1583|2929->1589|3201->1833|3217->1839|3261->1861|3917->2517|3966->2605|4018->2713|4069->2811|4118->2842|4165->2871|4218->2893|4267->2914|4372->2992|4387->2998|4431->3020|4839->3401|4860->3413|4913->3445|5029->3534|5044->3540|5102->3577|5506->3954|5527->3966|5582->4000|5700->4091|5715->4097|5771->4132|6002->4364|6048->4535|6097->4593|6142->4618|6188->4793|6237->4857|6282->4882|6327->4899|6518->5062|6547->5063|6684->5171|6714->5172|6856->5285|6886->5286|6916->5287|7194->5537|7223->5538|7360->5646|7390->5647|7532->5760|7562->5761|7592->5762|7891->6034|7906->6040|7966->6079|8020->6106|8035->6112|8116->6172|8169->6198|8184->6204|8233->6232
                  LINES: 28->1|32->1|33->4|35->6|35->6|35->6|36->7|50->21|50->21|50->21|51->22|51->22|51->22|52->23|53->24|53->24|53->24|53->24|54->25|56->27|56->27|56->27|59->30|59->30|59->30|69->40|70->41|71->42|72->43|73->44|74->45|75->46|76->47|77->48|77->48|77->48|82->53|82->53|82->53|83->54|83->54|83->54|90->61|90->61|90->61|91->62|91->62|91->62|97->68|98->69|99->70|100->71|101->72|102->73|103->74|104->75|110->81|110->81|110->81|110->81|110->81|110->81|110->81|115->86|115->86|115->86|115->86|115->86|115->86|115->86|123->94|123->94|123->94|125->96|125->96|125->96|126->97|126->97|126->97
                  -- GENERATED --
              */
          