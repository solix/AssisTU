
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
object suggestions extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Person,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(currentUser :Person):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.38*/("""

"""),format.raw/*3.1*/("""<html lang="en">
    <head>
        """),_display_(/*5.10*/linkLoader/*5.20*/.headlinks(title)),format.raw/*5.37*/("""
        """),format.raw/*6.9*/("""<link rel="stylesheet" type="text/css" href=""""),_display_(/*6.55*/routes/*6.61*/.Assets.at("css/suggestion.css")),format.raw/*6.93*/("""">

            <!-- Timeline CSS -->
        """),format.raw/*9.89*/("""

        """),format.raw/*11.9*/("""<!-- jQuery -->
    <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js" ></script>

        """),format.raw/*14.33*/("""
    """),format.raw/*15.103*/("""

        """),format.raw/*17.34*/("""
    """),format.raw/*18.111*/("""

    """),format.raw/*20.5*/("""</head>

    <body>
        <div id="wrapper">
            """),_display_(/*24.14*/dashboard("suggestion", currentUser)),format.raw/*24.50*/("""
            """),format.raw/*25.13*/("""<div id="page-wrapper">
                """),_display_(/*26.18*/template/*26.26*/.headericon("fa fa-lightbulb-o fa-5x")),format.raw/*26.64*/("""


            """),format.raw/*29.13*/("""<div class="container-fluid">
                <div class="page-header">
                    <h1 id="timeline">Step by Step Guide :</h1>
                </div>
                <ul class="timeline">
                    <li>
                        <div class="timeline-badge"><i class="">1</i></div>
                        <div class="timeline-panel">
                            <div class="timeline-heading">
                                <h4 class="timeline-title">Getting Started</h4>
                                <a class="btn btn-primary" data-toggle="collapse" href="#gettingStarted" aria-expanded="false" aria-controls="collapseExample">
                                     More..
                                </a>
                            </div>
                            <br>
                            <div class="collapse" id="gettingStarted">
                                <div class="well">
                                    <div class="timeline-body">
                                        <p>In research (and in your every day life) you acquire knowledge and experience. You start with observations that arise questions
                                            that need to be answered and shared. The steps that lead from an observation to a valid, ready to be made public,
                                            answer form a methodology known as “the scientific method”.</p>
                                        <p>The scientific inquiry was built up in time by many, beginning with Aristotle and is the basis for the modern science as we
                                            know it today. It developed in close relationship with the epistemology (acquiring knowledge) and with the philosophy of science.</p>

                                        <div class = "image">
                                            <img  src=""""),_display_(/*54.57*/routes/*54.63*/.Assets.at("images/tulib/sm1.png")),format.raw/*54.97*/("""" />
                                        </div>

                                    </div>
                                </div>
                            </div>

                        </div>
                    </li>
                    <li class="timeline-inverted">
                        <div class="timeline-badge warning"><i class="">2</i></div>
                        <div class="timeline-panel">
                            <div class="timeline-heading">
                                <h4 class="timeline-title">Key Points</h4>
                                <a class="btn btn-primary" data-toggle="collapse" href="#second" aria-expanded="false" aria-controls="collapseExample">
                                    More..
                                </a>
                            </div>
                            <br>
                            <div class="collapse" id="second">
                                <div class="well">
                                    <div class="timeline-body">
                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Expedita nostrum sit tempora vero. Error ipsam laborum maxime ratione reprehenderit? Animi at excepturi illo iste labore nemo saepe sapiente voluptas voluptatibus.</p>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Adipisci amet atque consectetur cumque dignissimos dolorem est exercitationem in magnam magni maxime nam nemo officiis quod sint, tempora ut voluptatibus voluptatum?</p>

                                        <div class = "image">
                                            <img  src=""""),_display_(/*80.57*/routes/*80.63*/.Assets.at("images/tulib/sm1.png")),format.raw/*80.97*/("""" />
                                        </div>

                                    </div>
                                </div>
                            </div>

                        </div>
                    </li>
                    <li>
                        <div class="timeline-badge danger"><i class="">3</i></div>
                        <div class="timeline-panel">
                            <div class="timeline-heading">
                                <h4 class="timeline-title">Mussum ipsum cacilds</h4>
                            </div>
                            <div class="timeline-body">
                                <p>Mussum ipsum cacilds, vidis litro abertis. Consetis adipiscings elitis. Pra lá , depois divoltis porris, paradis. Paisis, filhis, espiritis santis. Mé faiz elementum girarzis, nisi eros vermeio, in elementis mé pra quem é amistosis quis leo. Manduma pindureta quium dia nois paga. Sapien in monti palavris qui num significa nadis i pareci latim. Interessantiss quisso pudia ce receita de bolis, mais bolis eu num gostis.</p>
                            </div>
                        </div>
                    </li>


                </ul>
            </div>













                """),format.raw/*117.51*/("""
                    """),format.raw/*118.71*/("""
                        """),format.raw/*119.107*/("""
                        """),format.raw/*120.44*/("""
                            """),format.raw/*121.99*/("""
                                """),format.raw/*122.102*/("""
                                    """),format.raw/*123.124*/("""
                                """),format.raw/*124.41*/("""
                            """),format.raw/*125.38*/("""
                            """),format.raw/*126.99*/("""
                                """),format.raw/*127.95*/("""
                                    """),format.raw/*128.120*/("""
                                """),format.raw/*129.41*/("""
                            """),format.raw/*130.38*/("""
                            """),format.raw/*131.99*/("""
                                """),format.raw/*132.103*/("""
                                    """),format.raw/*133.120*/("""
                                """),format.raw/*134.41*/("""
                            """),format.raw/*135.38*/("""
                            """),format.raw/*136.99*/("""
                                """),format.raw/*137.92*/("""
                                    """),format.raw/*138.121*/("""
                                """),format.raw/*139.41*/("""
                            """),format.raw/*140.38*/("""
                            """),format.raw/*141.99*/("""
                                """),format.raw/*142.96*/("""
                                    """),format.raw/*143.117*/("""
                                """),format.raw/*144.41*/("""
                            """),format.raw/*145.38*/("""
                            """),format.raw/*146.99*/("""
                                """),format.raw/*147.96*/("""
                                    """),format.raw/*148.124*/("""
                                """),format.raw/*149.41*/("""
                            """),format.raw/*150.38*/("""
                        """),format.raw/*151.34*/("""
                    """),format.raw/*152.31*/("""
                """),format.raw/*153.27*/("""
            """),format.raw/*154.13*/("""</div>
        </div>
            """),format.raw/*156.48*/("""
            """),format.raw/*157.47*/("""
            """),format.raw/*158.34*/("""
            """),format.raw/*159.39*/("""
            """),format.raw/*160.20*/("""
            """),format.raw/*161.26*/("""
            """),format.raw/*162.13*/("""<!-- jQuery -->
        <script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js" ></script>
            <!--bootstrap-->
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
            <!--sb-Admin javascript Needed for Dropdown to work-->
        <script src=""""),_display_(/*167.23*/routes/*167.29*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*167.68*/(""""></script>
            <!--MetisMenu javascript Needed for Dropdown to work-->
        <script src=""""),_display_(/*169.23*/routes/*169.29*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*169.89*/(""""></script>
    </body>

</html>"""))}
  }

  def render(title:String,currentUser:Person): play.twirl.api.HtmlFormat.Appendable = apply(title)(currentUser)

  def f:((String) => (Person) => play.twirl.api.HtmlFormat.Appendable) = (title) => (currentUser) => apply(title)(currentUser)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:16 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/suggestions.scala.html
                  HASH: cf3455c8994f5ea621ccc5b8328e0df4a0129ab9
                  MATRIX: 736->1|860->37|888->39|951->76|969->86|1006->103|1041->112|1113->158|1127->164|1179->196|1252->322|1289->332|1430->469|1464->572|1502->607|1536->718|1569->724|1656->784|1713->820|1754->833|1822->874|1839->882|1898->920|1941->935|3854->2821|3869->2827|3924->2861|5638->4548|5653->4554|5708->4588|6985->5870|7035->5941|7090->6048|7144->6092|7202->6191|7265->6293|7332->6417|7394->6458|7452->6496|7510->6595|7572->6690|7639->6810|7701->6851|7759->6889|7817->6988|7880->7091|7947->7211|8009->7252|8067->7290|8125->7389|8187->7481|8254->7602|8316->7643|8374->7681|8432->7780|8494->7876|8561->7993|8623->8034|8681->8072|8739->8171|8801->8267|8868->8391|8930->8432|8988->8470|9042->8504|9092->8535|9138->8562|9180->8575|9243->8644|9285->8691|9327->8725|9369->8764|9411->8784|9453->8810|9495->8823|9843->9143|9859->9149|9920->9188|10050->9290|10066->9296|10148->9356
                  LINES: 26->1|29->1|31->3|33->5|33->5|33->5|34->6|34->6|34->6|34->6|37->9|39->11|42->14|43->15|45->17|46->18|48->20|52->24|52->24|53->25|54->26|54->26|54->26|57->29|82->54|82->54|82->54|108->80|108->80|108->80|145->117|146->118|147->119|148->120|149->121|150->122|151->123|152->124|153->125|154->126|155->127|156->128|157->129|158->130|159->131|160->132|161->133|162->134|163->135|164->136|165->137|166->138|167->139|168->140|169->141|170->142|171->143|172->144|173->145|174->146|175->147|176->148|177->149|178->150|179->151|180->152|181->153|182->154|184->156|185->157|186->158|187->159|188->160|189->161|190->162|195->167|195->167|195->167|197->169|197->169|197->169
                  -- GENERATED --
              */
          