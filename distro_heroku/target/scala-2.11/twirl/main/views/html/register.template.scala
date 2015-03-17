
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
object register extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Person],Boolean,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(registerForm: Form[Person], errors: Boolean):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.47*/("""
"""),format.raw/*2.1*/("""<html lang="en">
<head>
"""),_display_(/*4.2*/linkLoader/*4.12*/.headlinks("Register")),format.raw/*4.34*/("""
    """),format.raw/*5.5*/("""<!-- Bootstrap_Custom CSS -->
<link href=""""),_display_(/*6.14*/routes/*6.20*/.Assets.at("css/bootstrap_custom.css")),format.raw/*6.58*/("""" rel="stylesheet">

</head>
<body>
<div class="container">
    <div class="page-header">
        <div class="container-fluid ">
            <div class="panel-heading" style="text-align: center">
                <i class="fa fa-pencil-square-o fa-5x"></i> <h3>Let's get you signed up.</h3>
            </div>
        </div>
    </div>
        """),format.raw/*18.30*/("""
            """),format.raw/*19.55*/("""
                """),format.raw/*20.41*/("""
                    """),format.raw/*21.49*/("""
                        """),format.raw/*22.72*/("""
                        """),format.raw/*23.54*/("""
                            """),format.raw/*24.145*/("""
                            """),format.raw/*25.127*/("""
                        """),format.raw/*26.35*/("""
                    """),format.raw/*27.31*/("""
                    """),format.raw/*28.49*/("""
                        """),format.raw/*29.80*/("""
                        """),format.raw/*30.54*/("""
                            """),format.raw/*31.145*/("""
                            """),format.raw/*32.127*/("""
                        """),format.raw/*33.35*/("""
                    """),format.raw/*34.31*/("""
                    """),format.raw/*35.49*/("""
                        """),format.raw/*36.79*/("""
                        """),format.raw/*37.54*/("""
                            """),format.raw/*38.144*/("""
                            """),format.raw/*39.127*/("""
                        """),format.raw/*40.35*/("""
                    """),format.raw/*41.31*/("""
                    """),format.raw/*42.105*/("""
                """),format.raw/*43.28*/("""
            """),format.raw/*44.23*/("""
        """),format.raw/*45.19*/("""
        """),format.raw/*46.24*/("""
            """),format.raw/*47.135*/("""
        """),format.raw/*48.14*/("""
        """),format.raw/*49.66*/("""
            """),format.raw/*50.152*/("""
            """),format.raw/*51.148*/("""
            """),format.raw/*52.106*/("""
            """),format.raw/*53.113*/("""
            """),format.raw/*54.111*/("""
            """),format.raw/*55.116*/("""
            """),format.raw/*56.128*/("""
            """),format.raw/*57.55*/("""
            """),format.raw/*58.80*/("""
                """),format.raw/*59.57*/("""
                    """),format.raw/*60.104*/("""
                """),format.raw/*61.27*/("""
                """),format.raw/*62.57*/("""
                    """),format.raw/*63.103*/("""
                """),format.raw/*64.27*/("""
            """),format.raw/*65.23*/("""
        """),format.raw/*66.14*/("""

"""),format.raw/*68.1*/("""</div>

    <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" ></script>
    <script src=""""),_display_(/*71.19*/routes/*71.25*/.Assets.at("javascripts/formValidationSetup.js")),format.raw/*71.73*/(""""></script>
<!--bootstrap-->
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
<!--sb-Admin-->
<script src=""""),_display_(/*75.15*/routes/*75.21*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*75.60*/(""""></script>

<script src=""""),_display_(/*77.15*/routes/*77.21*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*77.81*/(""""></script>

</body>
</html>


"""))}
  }

  def render(registerForm:Form[Person],errors:Boolean): play.twirl.api.HtmlFormat.Appendable = apply(registerForm,errors)

  def f:((Form[Person],Boolean) => play.twirl.api.HtmlFormat.Appendable) = (registerForm,errors) => apply(registerForm,errors)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:16 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/register.scala.html
                  HASH: a55b3f82ff564621259b8e82908cfce1e8a01dc2
                  MATRIX: 740->1|873->46|900->47|950->72|968->82|1010->104|1041->109|1110->152|1124->158|1182->196|1553->560|1594->615|1639->656|1688->705|1741->777|1794->831|1852->976|1910->1103|1963->1138|2012->1169|2061->1218|2114->1298|2167->1352|2225->1497|2283->1624|2336->1659|2385->1690|2434->1739|2487->1818|2540->1872|2598->2016|2656->2143|2709->2178|2758->2209|2808->2314|2853->2342|2894->2365|2931->2384|2968->2408|3010->2543|3047->2557|3084->2623|3126->2775|3168->2923|3210->3029|3252->3142|3294->3253|3336->3369|3378->3497|3419->3552|3460->3632|3505->3689|3555->3793|3600->3820|3645->3877|3695->3980|3740->4007|3781->4030|3818->4044|3847->4046|3988->4160|4003->4166|4072->4214|4244->4359|4259->4365|4319->4404|4373->4431|4388->4437|4469->4497
                  LINES: 26->1|29->1|30->2|32->4|32->4|32->4|33->5|34->6|34->6|34->6|46->18|47->19|48->20|49->21|50->22|51->23|52->24|53->25|54->26|55->27|56->28|57->29|58->30|59->31|60->32|61->33|62->34|63->35|64->36|65->37|66->38|67->39|68->40|69->41|70->42|71->43|72->44|73->45|74->46|75->47|76->48|77->49|78->50|79->51|80->52|81->53|82->54|83->55|84->56|85->57|86->58|87->59|88->60|89->61|90->62|91->63|92->64|93->65|94->66|96->68|99->71|99->71|99->71|103->75|103->75|103->75|105->77|105->77|105->77
                  -- GENERATED --
              */
          