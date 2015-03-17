
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""


"""),format.raw/*4.1*/("""<html>


    <html lang="en">
"""),_display_(/*8.2*/(title:String)),format.raw/*8.16*/("""
    """),format.raw/*9.5*/("""<head>

        """),_display_(/*11.10*/linkLoader/*11.20*/.headlinks(title)),format.raw/*11.37*/("""
     
    """),format.raw/*13.5*/("""</head>
    <body>
        """),_display_(/*15.10*/content),format.raw/*15.17*/("""
        """),format.raw/*16.9*/("""<!-- jQuery -->
        <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" ></script>
        <!--bootstrap-->
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

        <!--sb-Admin-->
        <script src=""""),_display_(/*22.23*/routes/*22.29*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*22.68*/(""""></script>

        <script src=""""),_display_(/*24.23*/routes/*24.29*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*24.89*/(""""></script>

        <!--<script src=""""),_display_(/*26.27*/routes/*26.33*/.Assets.at("javascripts/plugins/morris/raphael.min.js")),format.raw/*26.88*/(""""></script>-->
        <!--<script src=""""),_display_(/*27.27*/routes/*27.33*/.Assets.at("javascripts/plugins/morris/morris.min.js")),format.raw/*27.87*/(""""></script>-->
        <!--<script src=""""),_display_(/*28.27*/routes/*28.33*/.Assets.at("javascripts/plugins/morris/morris-data.js")),format.raw/*28.88*/(""""></script>-->


    </body>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:16 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/main.scala.html
                  HASH: 3f17659cab4d9cdb7a93c5b58b0177b7c403aeb1
                  MATRIX: 727->1|845->31|874->34|930->65|964->79|995->84|1039->101|1058->111|1096->128|1134->139|1189->167|1217->174|1253->183|1554->457|1569->463|1629->502|1691->537|1706->543|1787->603|1853->642|1868->648|1944->703|2012->744|2027->750|2102->804|2170->845|2185->851|2261->906
                  LINES: 26->1|29->1|32->4|36->8|36->8|37->9|39->11|39->11|39->11|41->13|43->15|43->15|44->16|50->22|50->22|50->22|52->24|52->24|52->24|54->26|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28
                  -- GENERATED --
              */
          