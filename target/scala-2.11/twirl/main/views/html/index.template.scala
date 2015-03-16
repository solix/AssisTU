
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Person,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(currentUser: Person):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.38*/("""

"""),format.raw/*3.1*/("""<html lang="en">
    <head>
        """),_display_(/*5.10*/linkLoader/*5.20*/.headlinks(title)),format.raw/*5.37*/("""
    """),format.raw/*6.5*/("""</head>
    <body>
        <div id="wrapper">
            """),_display_(/*9.14*/dashboard("dashboard",currentUser)),format.raw/*9.48*/("""
            """),format.raw/*10.13*/("""<div id="page-wrapper" >
                <div id="one">
                """),_display_(/*12.18*/template/*12.26*/.headericon("fa fa-tachometer fa-5x")),format.raw/*12.63*/("""
                """),format.raw/*13.17*/("""</div>
                """),_display_(/*14.18*/home/*14.22*/.overviewblocks(currentUser.id)),format.raw/*14.53*/("""


            """),format.raw/*17.13*/("""</div>
        </div>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>    
        <script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-tour/0.10.1/js/bootstrap-tour.js"></script>
        <script src=""""),_display_(/*22.23*/routes/*22.29*/.Assets.at("javascripts/walkthrough.js")),format.raw/*22.69*/(""""></script>
        <!--sb-Admin javascript Needed for Dropdown to work-->
        <script src=""""),_display_(/*24.23*/routes/*24.29*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*24.68*/(""""></script>
            <!--MetisMenu javascript Needed for Dropdown to work-->
        <script src=""""),_display_(/*26.23*/routes/*26.29*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*26.89*/(""""></script>

    </body>
</html>
"""))}
  }

  def render(title:String,currentUser:Person): play.twirl.api.HtmlFormat.Appendable = apply(title)(currentUser)

  def f:((String) => (Person) => play.twirl.api.HtmlFormat.Appendable) = (title) => (currentUser) => apply(title)(currentUser)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:03 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/index.scala.html
                  HASH: e25af2e63bf61c0bb31cf3067c3b047d1ceb4516
                  MATRIX: 730->1|854->37|882->39|945->76|963->86|1000->103|1031->108|1116->167|1170->201|1211->214|1311->287|1328->295|1386->332|1431->349|1482->373|1495->377|1547->408|1590->423|1970->776|1985->782|2046->822|2170->919|2185->925|2245->964|2374->1066|2389->1072|2470->1132
                  LINES: 26->1|29->1|31->3|33->5|33->5|33->5|34->6|37->9|37->9|38->10|40->12|40->12|40->12|41->13|42->14|42->14|42->14|45->17|50->22|50->22|50->22|52->24|52->24|52->24|54->26|54->26|54->26
                  -- GENERATED --
              */
          