
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
object signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Boolean,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signupForm: Form[_], info: Boolean, theme: String, message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.70*/("""
    """),format.raw/*2.5*/("""<html>
    <head>
        """),_display_(/*4.10*/linkLoader/*4.20*/.loginhead()),format.raw/*4.32*/("""
    """),format.raw/*5.5*/("""</head>
    <body>
        <div class="container">
            <div class="page-header">
                <div class="container-fluid ">
                    <div class="row" style="font-size: 32pt; text-align: center;">
                        <p style="margin-bottom: 0"><i class="fa fa-pencil-square-o"></i></p>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3">
                    """),_display_(/*17.22*/if(info)/*17.30*/ {_display_(Seq[Any](format.raw/*17.32*/("""
                        """),_display_(/*18.26*/template/*18.34*/.alert(theme, message)),format.raw/*18.56*/("""
                    """)))}),format.raw/*19.22*/("""
                    """),_display_(/*20.22*/helper/*20.28*/.form(routes.Signup.doSignup)/*20.57*/{_display_(Seq[Any](format.raw/*20.58*/("""
                        """),format.raw/*21.25*/("""<div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label class="control-label" for="firstname">First name</label>
                                    <input autofocus class="form-control input-sm" id="firstname" name="first_name" value=""""),_display_(/*25.125*/signupForm("first_name")/*25.149*/.value),format.raw/*25.155*/("""" type="text" placeholder="First name">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label class="control-label" for="lastname">Last name</label>
                                    <input autofocus class="form-control input-sm" id="lastname" name="last_name" value=""""),_display_(/*31.123*/signupForm("last_name")/*31.146*/.value),format.raw/*31.152*/("""" type="text" placeholder="Last name">
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label" for="email">Email</label>
                            <input autofocus class="form-control input-sm" id="email" name="email" value=""""),_display_(/*37.108*/signupForm("email")/*37.127*/.value),format.raw/*37.133*/("""" type="email" placeholder="E-mail">
                        </div>
                        <div class="form-group ">
                            <label class="control-label" for="password">Password</label>
                            <input autofocus class="form-control input-sm" id="password" name="password" type="password" placeholder="Password">
                            <span class="help-inline" style="font-size: x-small;">Minimum length: 6</span>
                        </div>
                        <div class="form-group ">
                            <label class="control-label" for="password">Repeat Password</label>
                            <input autofocus class="form-control input-sm" id="repeatPassword" name="repeatPassword" type="password" placeholder="Confirm password">
                            <span class="help-inline" style="font-size: x-small;">Minimum length: 6</span>
                        </div>
                        <div class="controls">
                            <div class="row" style="text-align: center">
                                <div class="col-lg-6">
                                    <a type="button" class="btn btn-sm btn-default center-block" href=""""),_display_(/*52.105*/routes/*52.111*/.Authentication.login),format.raw/*52.132*/(""""
                                    style="width: 100%; min-width: 150px; font-size: 12pt">
                                        Back to login
                                    </a>
                                </div>
                                <div class="col-lg-6">
                                    <button type="submit" class="btn btn-sm btn-success center-block"
                                    style="width: 100%; min-width: 150px; font-size: 12pt">
                                        Sign up!
                                    </button>
                                </div>
                            </div>
                        </div>
                    """)))}),format.raw/*65.22*/("""
                """),format.raw/*66.17*/("""</div>
            </div>
        </div>

        <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" ></script>
            <!--bootstrap-->
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

            <!--sb-Admin-->
        <script src=""""),_display_(/*75.23*/routes/*75.29*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*75.68*/(""""></script>

        <script src=""""),_display_(/*77.23*/routes/*77.29*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*77.89*/(""""></script>
        <script src=""""),_display_(/*78.23*/routes/*78.29*/.Assets.at("javascripts.js")),format.raw/*78.57*/(""""></script>

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
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/signup.scala.html
                  HASH: fceaf89ebc962ac281a5cb4ece2dce18ee13651e
                  MATRIX: 818->1|974->69|1005->74|1058->101|1076->111|1108->123|1139->128|1679->641|1696->649|1736->651|1789->677|1806->685|1849->707|1902->729|1951->751|1966->757|2004->786|2043->787|2096->812|2474->1162|2508->1186|2536->1192|3006->1634|3039->1657|3067->1663|3478->2046|3507->2065|3535->2071|4781->3289|4797->3295|4840->3316|5569->4014|5614->4031|5949->4339|5964->4345|6024->4384|6086->4419|6101->4425|6182->4485|6243->4519|6258->4525|6307->4553
                  LINES: 28->1|31->1|32->2|34->4|34->4|34->4|35->5|47->17|47->17|47->17|48->18|48->18|48->18|49->19|50->20|50->20|50->20|50->20|51->21|55->25|55->25|55->25|61->31|61->31|61->31|67->37|67->37|67->37|82->52|82->52|82->52|95->65|96->66|105->75|105->75|105->75|107->77|107->77|107->77|108->78|108->78|108->78
                  -- GENERATED --
              */
          