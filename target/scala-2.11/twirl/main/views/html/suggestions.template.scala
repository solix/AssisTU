
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

    </head>

    <body>
        <div id="wrapper">
            """),_display_(/*12.14*/dashboard("suggestion", currentUser)),format.raw/*12.50*/("""
            """),format.raw/*13.13*/("""<div id="page-wrapper">
                """),_display_(/*14.18*/template/*14.26*/.headericon("fa fa-lightbulb-o fa-5x")),format.raw/*14.64*/("""
            """),format.raw/*15.13*/("""<div class="container-fluid">
                <div class="page-header">
                    <h1 id="timeline" >Step by Step Guide :</h1>
                </div>
                <ul class="timeline">
                    <li>
                        <div class="timeline-badge"><i>1</i></div>
                        <div class="timeline-panel">
                            <div class="timeline-heading" >
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
                                            <img  src=""""),_display_(/*40.57*/routes/*40.63*/.Assets.at("images/tulib/sm1.png")),format.raw/*40.97*/("""" />
                                        </div>

                                    </div>
                                </div>
                            </div>

                        </div>
                    </li>
                    <li class="timeline-inverted">
                        <div class="timeline-badge warning"><i >2</i></div>
                        <div class="timeline-panel">
                            <div class="timeline-heading" >
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
                                            <img  src=""""),_display_(/*66.57*/routes/*66.63*/.Assets.at("images/tulib/sm1.png")),format.raw/*66.97*/("""" />
                                        </div>

                                    </div>
                                </div>
                            </div>

                        </div>
                    </li>
                    <li>
                        <div class="timeline-badge danger"><i >3</i></div>
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
            </div>
        </div>
            <!-- jQuery -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>    
     
            <!--sb-Admin javascript Needed for Dropdown to work-->
        <script src=""""),_display_(/*95.23*/routes/*95.29*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*95.68*/(""""></script>
            <!--MetisMenu javascript Needed for Dropdown to work-->
        <script src=""""),_display_(/*97.23*/routes/*97.29*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*97.89*/(""""></script>

    </body>

</html>"""))}
  }

  def render(title:String,currentUser:Person): play.twirl.api.HtmlFormat.Appendable = apply(title)(currentUser)

  def f:((String) => (Person) => play.twirl.api.HtmlFormat.Appendable) = (title) => (currentUser) => apply(title)(currentUser)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/suggestions.scala.html
                  HASH: 76491cb855a7765697da7b7cf575b6f1c636ebf8
                  MATRIX: 736->1|860->37|888->39|951->76|969->86|1006->103|1041->112|1113->158|1127->164|1179->196|1274->264|1331->300|1372->313|1440->354|1457->362|1516->400|1557->413|3463->2292|3478->2298|3533->2332|5240->4012|5255->4018|5310->4052|6904->5619|6919->5625|6979->5664|7108->5766|7123->5772|7204->5832
                  LINES: 26->1|29->1|31->3|33->5|33->5|33->5|34->6|34->6|34->6|34->6|40->12|40->12|41->13|42->14|42->14|42->14|43->15|68->40|68->40|68->40|94->66|94->66|94->66|123->95|123->95|123->95|125->97|125->97|125->97
                  -- GENERATED --
              */
          