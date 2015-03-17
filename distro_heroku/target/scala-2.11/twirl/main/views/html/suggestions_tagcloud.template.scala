
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
object suggestions_tagcloud extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,Person,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, subject: String, icon: String)(currentUser :Person):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.69*/("""

"""),format.raw/*3.1*/("""<html lang="en">
    <head>
        """),_display_(/*5.10*/linkLoader/*5.20*/.headlinks(title)),format.raw/*5.37*/("""

        """),format.raw/*7.28*/("""

        """),format.raw/*9.9*/("""<!-- jQuery -->
    <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" ></script>

        <!--Tag Cloud JS-->
    <script src=""""),_display_(/*13.19*/routes/*13.25*/.Assets.at("javascripts/jqcloud-1.0.4.min.js")),format.raw/*13.71*/("""" ></script>

        <!--Tag Cloud CSS-->
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*16.51*/routes/*16.57*/.Assets.at("css/jqcloud.css")),format.raw/*16.86*/("""">

    <script type="text/javascript">
    /*!
     * Create an array of word objects, each representing a word in the cloud
     */
    //        TODO: The random number generators and subset is only for presentation purposes, for production mode the weights need to be
    //        stored and retrieved from a static list
        """),_display_(/*24.10*/defining("Lorem ipsum dolor sit amet consectetur adipiscing elit Fusce lobortis nulla venenatis egestas varius nisl sem tincidunt risus quis tempor mauris mauris non tellus Vestibulum consectetur auctor nunc non fringilla dolor feugiat sed Ut ut bibendum ex ut ultrices dui Class aptent taciti sociosqu ad litora torquent per conubia nostra per inceptos himenaeos Etiam quis erat sit amet libero porttitor scelerisque sed a ligula Proin nec massa eu lacus tempor maximus ac vel dui Donec quam suscipit dapibus elit nec viverra magna Praesent vestibulum elementum augue quis condimentum Nam fringilla ante a bibendum varius Aliquam fringilla lacus ultrices ipsum laoreet lacinia Duis non lectus eget metus tempor feugiat sed ut est Donec vestibulum et mauris ac consectetur sociis natoque penatibus et magnis dis parturient montes nascetur ridiculus mus Phasellus et neque in ante ultrices consequat in elit volutpat tincidunt lectus et semper dui Cras quis consectetur eros Sed erat dui porttitor ut massa id condimentum tincidunt odio Sed augue justo aliquet eu elit a commodo pellentesque lectus Suspendisse molestie iaculis mattis".split(" "))/*24.1156*/ { words =>_display_(Seq[Any](format.raw/*24.1167*/("""
        """),format.raw/*25.9*/("""var word_array = [
            """),_display_(/*26.14*/defining(words.slice(0 , scala.util.Random.nextInt(words.length)))/*26.80*/{ subset =>_display_(Seq[Any](format.raw/*26.91*/("""
                """),_display_(/*27.18*/for(word <- subset) yield /*27.37*/ {_display_(Seq[Any](format.raw/*27.39*/("""
                    """),_display_(/*28.22*/if(!word.equals(words.last))/*28.50*/ {_display_(Seq[Any](format.raw/*28.52*/("""
                        """),format.raw/*29.25*/("""{"""),format.raw/*29.26*/(""" """),format.raw/*29.27*/("""text: """"),_display_(/*29.35*/word),format.raw/*29.39*/("""", weight: """),_display_(/*29.51*/scala/*29.56*/.util.Random.nextInt(100)),format.raw/*29.81*/(""" """),format.raw/*29.82*/("""+ 1, link : "http://tulib.tudelft.nl/" """),format.raw/*29.121*/("""}"""),format.raw/*29.122*/(""",
                    """)))}/*30.23*/else/*30.28*/{_display_(Seq[Any](format.raw/*30.29*/("""
                        """),format.raw/*31.25*/("""{"""),format.raw/*31.26*/(""" """),format.raw/*31.27*/("""text: """"),_display_(/*31.35*/word),format.raw/*31.39*/("""", weight: """),_display_(/*31.51*/scala/*31.56*/.util.Random.nextInt(100)),format.raw/*31.81*/(""" """),format.raw/*31.82*/("""+ 1, link : "http://tulib.tudelft.nl/" """),format.raw/*31.121*/("""}"""),format.raw/*31.122*/("""
                    """)))}),format.raw/*32.22*/("""
                """)))}),format.raw/*33.18*/("""
            """)))}),format.raw/*34.14*/("""
        """),format.raw/*35.9*/("""];
        """)))}),format.raw/*36.10*/("""


    """),format.raw/*39.5*/("""$(function() """),format.raw/*39.18*/("""{"""),format.raw/*39.19*/("""
    """),format.raw/*40.5*/("""// When DOM is ready, select the container element and call the jQCloud method, passing the array of words as the first argument.
    $("#tag_cloud").jQCloud(word_array);
    """),format.raw/*42.5*/("""}"""),format.raw/*42.6*/(""");
    </script>

    </head>

    <body>
        <div id="wrapper">
            """),_display_(/*49.14*/dashboard("suggestion", currentUser)),format.raw/*49.50*/("""
            """),format.raw/*50.13*/("""<div id="page-wrapper">
                """),_display_(/*51.18*/template/*51.26*/.headericon("fa fa-lightbulb-o fa-5x")),format.raw/*51.64*/("""
                """),format.raw/*52.17*/("""<div class="panel panel-info">
                    <div class="panel-body">
                        <div class="container-fluid" style="text-align: center">
                            <a type="button" href=""""),_display_(/*55.53*/routes/*55.59*/.Application.suggestions()),format.raw/*55.85*/("""" class="btn btn-primary pull-left"><i class="fa fa-arrow-circle-o-left"> Back</i></a>
                            """),format.raw/*56.108*/("""
                        """),format.raw/*57.25*/("""</div>
                        <div class="container-fluid" id="tag_cloud" style="height: 600px; text-align: center">
                            <label style="opacity: 0.3; color: lightgrey; font-size: 40pt; margin-top: 170px"><i class="fa """),_display_(/*59.125*/icon),format.raw/*59.129*/(""" """),format.raw/*59.130*/("""fa-5x"></i></label>
                        </div>
                    </div>
                </div>
            </div>
        </div>

            <!--bootstrap-->
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>

            <!--sb-Admin-->
        <script src=""""),_display_(/*70.23*/routes/*70.29*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*70.68*/(""""></script>


        <script src=""""),_display_(/*73.23*/routes/*73.29*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*73.89*/(""""></script>


    </body>

</html>"""))}
  }

  def render(title:String,subject:String,icon:String,currentUser:Person): play.twirl.api.HtmlFormat.Appendable = apply(title,subject,icon)(currentUser)

  def f:((String,String,String) => (Person) => play.twirl.api.HtmlFormat.Appendable) = (title,subject,icon) => (currentUser) => apply(title,subject,icon)(currentUser)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:16 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/suggestions_tagcloud.scala.html
                  HASH: f94415006cb4ad44ff630a2ee887279763738006
                  MATRIX: 759->1|914->68|942->70|1005->107|1023->117|1060->134|1097->163|1133->173|1311->324|1326->330|1393->376|1513->469|1528->475|1578->504|1940->839|3097->1985|3148->1996|3184->2005|3243->2037|3318->2103|3367->2114|3412->2132|3447->2151|3487->2153|3536->2175|3573->2203|3613->2205|3666->2230|3695->2231|3724->2232|3759->2240|3784->2244|3823->2256|3837->2261|3883->2286|3912->2287|3980->2326|4010->2327|4052->2351|4065->2356|4104->2357|4157->2382|4186->2383|4215->2384|4250->2392|4275->2396|4314->2408|4328->2413|4374->2438|4403->2439|4471->2478|4501->2479|4554->2501|4603->2519|4648->2533|4684->2542|4727->2554|4761->2561|4802->2574|4831->2575|4863->2580|5065->2755|5093->2756|5202->2838|5259->2874|5300->2887|5368->2928|5385->2936|5444->2974|5489->2991|5725->3200|5740->3206|5787->3232|5931->3426|5984->3451|6254->3693|6280->3697|6310->3698|6647->4008|6662->4014|6722->4053|6785->4089|6800->4095|6881->4155
                  LINES: 26->1|29->1|31->3|33->5|33->5|33->5|35->7|37->9|41->13|41->13|41->13|44->16|44->16|44->16|52->24|52->24|52->24|53->25|54->26|54->26|54->26|55->27|55->27|55->27|56->28|56->28|56->28|57->29|57->29|57->29|57->29|57->29|57->29|57->29|57->29|57->29|57->29|57->29|58->30|58->30|58->30|59->31|59->31|59->31|59->31|59->31|59->31|59->31|59->31|59->31|59->31|59->31|60->32|61->33|62->34|63->35|64->36|67->39|67->39|67->39|68->40|70->42|70->42|77->49|77->49|78->50|79->51|79->51|79->51|80->52|83->55|83->55|83->55|84->56|85->57|87->59|87->59|87->59|98->70|98->70|98->70|101->73|101->73|101->73
                  -- GENERATED --
              */
          