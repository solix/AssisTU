
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
      _display_ {import com.feth.play.module.pa.views.html._
import com.feth.play.module.pa.providers.AuthProvider

Seq[Any](format.raw/*1.70*/("""
"""),format.raw/*4.1*/("""<html>
    <head>
        """),_display_(/*6.10*/linkLoader/*6.20*/.loginhead()),format.raw/*6.32*/("""
    """),format.raw/*7.5*/("""</head>
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
                    """),_display_(/*19.22*/if(info)/*19.30*/ {_display_(Seq[Any](format.raw/*19.32*/("""
                        """),_display_(/*20.26*/template/*20.34*/.alert(theme, message)),format.raw/*20.56*/("""
                    """)))}),format.raw/*21.22*/("""
                    """),_display_(/*22.22*/helper/*22.28*/.form(routes.Signup.doSignup)/*22.57*/{_display_(Seq[Any](format.raw/*22.58*/("""
                        """),format.raw/*23.25*/("""<div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label class="control-label" for="firstname">First name</label>
                                    <input autofocus class="form-control input-sm" id="firstname" name="first_name" value=""""),_display_(/*27.125*/signupForm("first_name")/*27.149*/.value),format.raw/*27.155*/("""" type="text" placeholder="First name">
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label class="control-label" for="lastname">Last name</label>
                                    <input autofocus class="form-control input-sm" id="lastname" name="last_name" value=""""),_display_(/*33.123*/signupForm("last_name")/*33.146*/.value),format.raw/*33.152*/("""" type="text" placeholder="Last name">
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="control-label" for="email">Email</label>
                            <input autofocus class="form-control input-sm" id="email" name="email" value=""""),_display_(/*39.108*/signupForm("email")/*39.127*/.value),format.raw/*39.133*/("""" type="email" placeholder="E-mail">
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
                                    <a type="button" class="btn btn-sm btn-default center-block" href=""""),_display_(/*54.105*/routes/*54.111*/.Authentication.login),format.raw/*54.132*/(""""
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
                    """)))}),format.raw/*67.22*/("""
                """),format.raw/*68.17*/("""</div>
            </div>
        </div>

        <!--script type="text/javascript" src="https://apis.google.com/js/plusone.js"></script>
        <script>
        !function(d,s,id)"""),format.raw/*74.26*/("""{"""),format.raw/*74.27*/("""var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id))"""),format.raw/*74.135*/("""{"""),format.raw/*74.136*/("""js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);"""),format.raw/*74.249*/("""}"""),format.raw/*74.250*/("""}"""),format.raw/*74.251*/("""(document, 'script', 'twitter-wjs');
        </script>
        <script src="/p/min/script/scripts.min.js?1-4-0.379471333572466079"></script>
        <script type="text/javascript" src="https://apis.google.com/js/plusone.js"></script>
        <script>
        !function(d,s,id)"""),format.raw/*79.26*/("""{"""),format.raw/*79.27*/("""var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id))"""),format.raw/*79.135*/("""{"""),format.raw/*79.136*/("""js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);"""),format.raw/*79.249*/("""}"""),format.raw/*79.250*/("""}"""),format.raw/*79.251*/("""(document, 'script', 'twitter-wjs');
        </script-->

        <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" ></script>
            <!--bootstrap-->
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

            <!--sb-Admin-->
        <script src=""""),_display_(/*87.23*/routes/*87.29*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*87.68*/(""""></script>

        <script src=""""),_display_(/*89.23*/routes/*89.29*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*89.89*/(""""></script>
        <script src=""""),_display_(/*90.23*/routes/*90.29*/.Assets.at("javascripts.js")),format.raw/*90.57*/(""""></script>

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
                  DATE: Tue Feb 17 22:25:16 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/signup.scala.html
                  HASH: ca1eb411af8a526205433edcaf5db5e6c4a92781
                  MATRIX: 818->1|1071->69|1098->170|1151->197|1169->207|1201->219|1232->224|1772->737|1789->745|1829->747|1882->773|1899->781|1942->803|1995->825|2044->847|2059->853|2097->882|2136->883|2189->908|2567->1258|2601->1282|2629->1288|3099->1730|3132->1753|3160->1759|3571->2142|3600->2161|3628->2167|4874->3385|4890->3391|4933->3412|5662->4110|5707->4127|5915->4307|5944->4308|6081->4416|6111->4417|6253->4530|6283->4531|6313->4532|6617->4808|6646->4809|6783->4917|6813->4918|6955->5031|6985->5032|7015->5033|7366->5357|7381->5363|7441->5402|7503->5437|7518->5443|7599->5503|7660->5537|7675->5543|7724->5571
                  LINES: 28->1|32->1|33->4|35->6|35->6|35->6|36->7|48->19|48->19|48->19|49->20|49->20|49->20|50->21|51->22|51->22|51->22|51->22|52->23|56->27|56->27|56->27|62->33|62->33|62->33|68->39|68->39|68->39|83->54|83->54|83->54|96->67|97->68|103->74|103->74|103->74|103->74|103->74|103->74|103->74|108->79|108->79|108->79|108->79|108->79|108->79|108->79|116->87|116->87|116->87|118->89|118->89|118->89|119->90|119->90|119->90
                  -- GENERATED --
              */
          