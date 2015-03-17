
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
    """),_display_(/*5.6*/linkLoader/*5.16*/.headlinks(title)),format.raw/*5.33*/("""
    """),format.raw/*6.5*/("""</head>
    <body>
        <div id="wrapper">
            """),_display_(/*9.14*/dashboard("dashboard",currentUser)),format.raw/*9.48*/("""
            """),format.raw/*10.13*/("""<div id="page-wrapper">
                """),_display_(/*11.18*/template/*11.26*/.headericon("fa fa-tachometer fa-5x")),format.raw/*11.63*/("""
                """),_display_(/*12.18*/home/*12.22*/.overviewblocks(currentUser.id)),format.raw/*12.53*/("""
            """),format.raw/*13.13*/("""</div>
        </div>
            <!-- jQuery -->
        <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js" ></script>
            <!--bootstrap-->
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
            <!--sb-Admin javascript Needed for Dropdown to work-->
        <script src=""""),_display_(/*20.23*/routes/*20.29*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*20.68*/(""""></script>
            <!--MetisMenu javascript Needed for Dropdown to work-->
        <script src=""""),_display_(/*22.23*/routes/*22.29*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*22.89*/(""""></script>
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
                  DATE: Tue Feb 17 22:25:15 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/index.scala.html
                  HASH: f6f109bb642364904aef2c89f98b9c44a52d2d37
                  MATRIX: 730->1|854->37|882->39|940->72|958->82|995->99|1026->104|1111->163|1165->197|1206->210|1274->251|1291->259|1349->296|1394->314|1407->318|1459->349|1500->362|1881->716|1896->722|1956->761|2085->863|2100->869|2181->929
                  LINES: 26->1|29->1|31->3|33->5|33->5|33->5|34->6|37->9|37->9|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|48->20|48->20|48->20|50->22|50->22|50->22
                  -- GENERATED --
              */
          