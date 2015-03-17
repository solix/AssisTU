
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
object discussionFile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template8[String,Person,Project,DocumentFile,Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},Boolean,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(currentUser:Person)(project: Project)(document: DocumentFile)(message_form: Form[_])(info: Boolean, theme: String, message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.149*/("""
"""),format.raw/*2.1*/("""<html lang="en">
    <head>
        """),_display_(/*4.10*/linkLoader/*4.20*/.headlinks(title)),format.raw/*4.37*/("""

    """),format.raw/*6.5*/("""<link rel="stylesheet" type="text/css" href=""""),_display_(/*6.51*/routes/*6.57*/.Assets.at("css/message.css")),format.raw/*6.86*/("""">

    </head>
    <body>
        <div id="wrapper">
            """),_display_(/*11.14*/dashboard("project", currentUser)),format.raw/*11.47*/("""
            """),format.raw/*12.13*/("""<div id="page-wrapper">
                """),_display_(/*13.18*/template/*13.26*/.headericon("fa fa-file-text-o fa-5x")),format.raw/*13.64*/("""
                """),format.raw/*14.17*/("""<div class="row" style="text-align: center">
                    <h3>Create a new message about <br> """),_display_(/*15.58*/document/*15.66*/.name),format.raw/*15.71*/("""</h3>
                </div>
                <div class="col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3">
                """),_display_(/*18.18*/if(info)/*18.26*/ {_display_(Seq[Any](format.raw/*18.28*/("""
                    """),_display_(/*19.22*/template/*19.30*/.alert(theme, message)),format.raw/*19.52*/("""
                """)))}),format.raw/*20.18*/("""
                """),format.raw/*21.17*/("""</div>
                """),_display_(/*22.18*/helper/*22.24*/.form(action = routes.DiscussionData.postExternalMessage())/*22.83*/ {_display_(Seq[Any](format.raw/*22.85*/("""
                    """),format.raw/*23.21*/("""<div class="row" style="margin-top: 30px; margin-right: 40px">
                        <div class="col-xs-8 col-xs-offset-2">
                            <ul class="message" style="padding: 0; margin: 0">
                                <li>
                                    """),_display_(/*27.38*/defining(Role.find.where().eq("project",project).eq("person",currentUser).findUnique().role)/*27.130*/ { role =>_display_(Seq[Any](format.raw/*27.140*/("""
                                        """),_display_(/*28.42*/if(role.equals(Role.OWNER))/*28.69*/{_display_(Seq[Any](format.raw/*28.70*/("""
                                            """),format.raw/*29.45*/("""<div class="message-badge primary">
                                                <i class="fa fa-mortar-board" style="margin-top: 15px"></i>
                                            </div>
                                        """)))}),format.raw/*32.42*/("""
                                        """),_display_(/*33.42*/if(role.equals(Role.REVIEWER))/*33.72*/{_display_(Seq[Any](format.raw/*33.73*/("""
                                            """),format.raw/*34.45*/("""<div class="message-badge danger">
                                                <i class="fa fa-edit" style="margin-left: 4px; margin-top: 15px"></i>
                                            </div>
                                        """)))}),format.raw/*37.42*/("""
                                        """),_display_(/*38.42*/if(role.equals(Role.GUEST))/*38.69*/{_display_(Seq[Any](format.raw/*38.70*/("""
                                            """),format.raw/*39.45*/("""<div class="message-badge info">
                                                <i class="fa fa-suitcase" style="margin-left: 4px; margin-top: 15px"></i>
                                            </div>
                                        """)))}),format.raw/*42.42*/("""
                                    """)))}),format.raw/*43.38*/("""
                                    """),format.raw/*44.37*/("""<div class="message-panel" style="margin-left: 40px">
                                        <div class="message-heading">
                                            <input type="text" name="subject" class="form-control" value=""""),_display_(/*46.108*/message_form("subject")/*46.131*/.value),format.raw/*46.137*/("""" placeholder="Your subject here...">
                                            <hr class="hr" style="margin: 15px 0 10px">
                                            <textarea class="form-control" name="content" rows="5" placeholder="Your message here...">"""),_display_(/*48.136*/message_form("content")/*48.159*/.value),format.raw/*48.165*/("""</textarea>
                                            <hr class="hr" style="margin: 15px 0 10px">
                                            <input type="hidden" name="attachment" value=""""),_display_(/*50.92*/document/*50.100*/.id),format.raw/*50.103*/("""">
                                            <input type="hidden" name="projectID" value=""""),_display_(/*51.91*/document/*51.99*/.project.id),format.raw/*51.110*/("""">
                                            <p style="margin: 0; font-size: small"><b>Attachment</b>: """),_display_(/*52.104*/document/*52.112*/.name),format.raw/*52.117*/("""</p>
                                        </div>
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-md-4 col-md-offset-4 col-sm-6 col-sm-offset-3">
                        <div class="btn-group col-xs-6" role="group" style="margin:20px 0px 0px 0px">
                            <a type="button" class="btn btn-default col-xs-12" href=""""),_display_(/*61.87*/routes/*61.93*/.ProjectData.project(project.id)),format.raw/*61.125*/("""">Cancel</a>
                        </div>
                        <div class="btn-group col-xs-6" role="group" style="margin:20px 0px 0px 0px">
                            <button type="submit" class="btn btn-success col-xs-12">Post!</button>
                        </div>
                    </div>
                """)))}),format.raw/*67.18*/("""
            """),format.raw/*68.13*/("""</div>
        </div>
            <!-- jQuery -->
        <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js" ></script>
            <!--bootstrap-->
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
            <!--sb-Admin javascript Needed for Dropdown to work-->
        <script src=""""),_display_(/*75.23*/routes/*75.29*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*75.68*/(""""></script>
            <!--MetisMenu javascript Needed for Dropdown to work-->
        <script src=""""),_display_(/*77.23*/routes/*77.29*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*77.89*/(""""></script>
    </body>
</html>
"""))}
  }

  def render(title:String,currentUser:Person,project:Project,document:DocumentFile,message_form:Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
},info:Boolean,theme:String,message:String): play.twirl.api.HtmlFormat.Appendable = apply(title)(currentUser)(project)(document)(message_form)(info,theme,message)

  def f:((String) => (Person) => (Project) => (DocumentFile) => (Form[_$1] forSome { 
   type _$1 >: _root_.scala.Nothing <: _root_.scala.Any
}) => (Boolean,String,String) => play.twirl.api.HtmlFormat.Appendable) = (title) => (currentUser) => (project) => (document) => (message_form) => (info,theme,message) => apply(title)(currentUser)(project)(document)(message_form)(info,theme,message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:15 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/discussionFile.scala.html
                  HASH: 71489866d9e9a2b4c9da91e47fd4cab142d0a160
                  MATRIX: 861->1|1097->148|1124->149|1187->186|1205->196|1242->213|1274->219|1346->265|1360->271|1409->300|1503->367|1557->400|1598->413|1666->454|1683->462|1742->500|1787->517|1916->619|1933->627|1959->632|2112->758|2129->766|2169->768|2218->790|2235->798|2278->820|2327->838|2372->855|2423->879|2438->885|2506->944|2546->946|2595->967|2901->1246|3003->1338|3052->1348|3121->1390|3157->1417|3196->1418|3269->1463|3536->1699|3605->1741|3644->1771|3683->1772|3756->1817|4032->2062|4101->2104|4137->2131|4176->2132|4249->2177|4527->2424|4596->2462|4661->2499|4920->2730|4953->2753|4981->2759|5270->3020|5303->3043|5331->3049|5549->3240|5567->3248|5592->3251|5712->3344|5729->3352|5762->3363|5896->3469|5914->3477|5941->3482|6465->3979|6480->3985|6534->4017|6885->4337|6926->4350|7307->4704|7322->4710|7382->4749|7511->4851|7526->4857|7607->4917
                  LINES: 28->1|31->1|32->2|34->4|34->4|34->4|36->6|36->6|36->6|36->6|41->11|41->11|42->12|43->13|43->13|43->13|44->14|45->15|45->15|45->15|48->18|48->18|48->18|49->19|49->19|49->19|50->20|51->21|52->22|52->22|52->22|52->22|53->23|57->27|57->27|57->27|58->28|58->28|58->28|59->29|62->32|63->33|63->33|63->33|64->34|67->37|68->38|68->38|68->38|69->39|72->42|73->43|74->44|76->46|76->46|76->46|78->48|78->48|78->48|80->50|80->50|80->50|81->51|81->51|81->51|82->52|82->52|82->52|91->61|91->61|91->61|97->67|98->68|105->75|105->75|105->75|107->77|107->77|107->77
                  -- GENERATED --
              */
          