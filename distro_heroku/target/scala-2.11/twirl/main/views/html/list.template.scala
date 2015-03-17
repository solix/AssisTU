
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
object list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Person,List[Event],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(currentUser:Person,events : List[Event] ):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
import helper.twitterBootstrap

Seq[Any](format.raw/*1.59*/("""

    """),format.raw/*4.1*/("""    """),format.raw/*5.1*/("""
    """),format.raw/*6.5*/("""<head>

        """),_display_(/*8.10*/linkLoader/*8.20*/.headlinks(title)),format.raw/*8.37*/("""
    """),format.raw/*9.5*/("""<link rel="stylesheet" media="screen" href='"""),_display_(/*9.50*/routes/*9.56*/.Assets.at("fullcalendar-1.5.3/fullcalendar/fullcalendar.css")),format.raw/*9.118*/("""'>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.18/jquery-ui.min.js" type="text/javascript"></script>
    <script src='"""),_display_(/*12.19*/routes/*12.25*/.Assets.at("bootstrap-2.0.2/js/bootstrap.min.js")),format.raw/*12.74*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*13.19*/routes/*13.25*/.Assets.at("fullcalendar-1.5.3/fullcalendar/fullcalendar.min.js")),format.raw/*13.90*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*14.19*/routes/*14.25*/.Assets.at("javascripts/renderCalendar.js")),format.raw/*14.68*/("""' type="text/javascript"></script>
    <script src='"""),_display_(/*15.19*/routes/*15.25*/.Assets.at("bootstrap-2.0.2/js/bootstrap.min.js")),format.raw/*15.74*/("""' type="text/javascript"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.13.1/jquery.validate.min.js" type="text/javascript"></script>

    </head>
    <body>

        <div id="wrapper">
            """),_display_(/*22.14*/dashboard("calendar", currentUser)),format.raw/*22.48*/("""
        """),format.raw/*23.9*/("""<div id="page-wrapper">
            """),_display_(/*24.14*/template/*24.22*/.headericon("fa fa-calendar fa-5x")),format.raw/*24.57*/("""

                    """),format.raw/*26.21*/("""<a  class="btn btn-default btn=sm" href=""""),_display_(/*26.63*/routes/*26.69*/.CalendarData.calendar()),format.raw/*26.93*/("""">
                        <span class="fa fa-calendar"></span> Back to Calendar
                    </a>


            <hr class="hr" style="margin-top: 10px">


                <div class="well">
                        <h2>Event's list</h2>
                        <table class="table table-striped table-bordered">
                            <thead>
                                <tr>
                                    <th  >Event</th>
                                    <th >From</th>
                                    <th >To</th>
                                    """),format.raw/*42.142*/("""
                                    """),format.raw/*43.50*/("""
                                """),format.raw/*44.33*/("""</tr>
                            </thead>
                            <tbody>
                            """),_display_(/*47.30*/for(event <- events) yield /*47.50*/{_display_(Seq[Any](format.raw/*47.51*/("""
                                """),format.raw/*48.33*/("""<tr>
                                    <td><a href=""""),_display_(/*49.51*/routes/*49.57*/.CalendarData.edit(event.id)),format.raw/*49.85*/("""">"""),_display_(/*49.88*/event/*49.93*/.title),format.raw/*49.99*/("""</a></td>
                                    """),_display_(/*50.38*/if(event.allDay && event.endsSameDay)/*50.75*/{_display_(Seq[Any](format.raw/*50.76*/("""
                                        """),format.raw/*51.41*/("""<td colspan="2">"""),_display_(/*51.58*/if(event.start == null)/*51.81*/{_display_(Seq[Any](format.raw/*51.82*/(""" """),format.raw/*51.83*/("""- """)))}/*51.87*/else/*51.92*/{_display_(Seq[Any](_display_(/*51.94*/event/*51.99*/.start.format("dd.MM.yyyy")),format.raw/*51.126*/(""" """),format.raw/*51.127*/("""(All day)""")))}),format.raw/*51.137*/("""</td>
                                    """)))}/*52.39*/else/*52.44*/{_display_(Seq[Any](format.raw/*52.45*/("""
                                        """),_display_(/*53.42*/if(event.allDay)/*53.58*/{_display_(Seq[Any](format.raw/*53.59*/("""
                                            """),format.raw/*54.45*/("""<td colspan="2">"""),_display_(/*54.62*/if(event.start == null)/*54.85*/{_display_(Seq[Any](format.raw/*54.86*/(""" """),format.raw/*54.87*/("""- """)))}/*54.91*/else/*54.96*/{_display_(_display_(/*54.98*/event/*54.103*/.start.format("dd.MM.yyyy")))}),format.raw/*54.131*/(""" """),format.raw/*54.132*/("""- """),_display_(/*54.135*/if(event.end == null)/*54.156*/{_display_(Seq[Any](format.raw/*54.157*/(""" """),format.raw/*54.158*/("""- """)))}/*54.162*/else/*54.167*/{_display_(_display_(/*54.169*/event/*54.174*/.end.format("dd.MM.yyyy")))}),format.raw/*54.200*/(""" """),format.raw/*54.201*/("""(All days)</td>
                                        """)))}/*55.43*/else/*55.48*/{_display_(Seq[Any](format.raw/*55.49*/("""
                                            """),format.raw/*56.45*/("""<td>"""),_display_(/*56.50*/if(event.start == null)/*56.73*/{_display_(Seq[Any](format.raw/*56.74*/(""" """),format.raw/*56.75*/("""- """)))}/*56.79*/else/*56.84*/{_display_(_display_(/*56.86*/event/*56.91*/.start.format("dd.MM.yyyy H:mm")))}),format.raw/*56.124*/("""</td>
                                            <td>"""),_display_(/*57.50*/if(event.end == null)/*57.71*/{_display_(Seq[Any](format.raw/*57.72*/(""" """),format.raw/*57.73*/("""- """)))}/*57.77*/else/*57.82*/{_display_(_display_(/*57.84*/event/*57.89*/.end.format("dd.MM.yyyy H:mm")))}),format.raw/*57.120*/("""</td>
                                        """)))}),format.raw/*58.42*/("""
                                    """)))}),format.raw/*59.38*/("""
                                    """),format.raw/*60.37*/("""<td>
                                        <a href=""""),_display_(/*61.51*/routes/*61.57*/.CalendarData.delete(event.id)),format.raw/*61.87*/(""""><i class="fa fa-trash"></i></a>
                                    </td>
                                    <td>
                                        <a href=""""),_display_(/*64.51*/routes/*64.57*/.CalendarData.edit(event.id)),format.raw/*64.85*/(""""><i class="fa fa-pencil"></i></a>
                                    </td>
                                </tr>
                            """)))}),format.raw/*67.30*/("""
                            """),format.raw/*68.29*/("""</tbody>
                        </table>


                    </div>

        </div>

        </div>



            <!--bootstrap-->
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
            <!--sb-Admin-->
        <script src=""""),_display_(/*83.23*/routes/*83.29*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*83.68*/(""""></script>

        <script src=""""),_display_(/*85.23*/routes/*85.29*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*85.89*/(""""></script>

    </body>
"""))}
  }

  def render(title:String,currentUser:Person,events:List[Event]): play.twirl.api.HtmlFormat.Appendable = apply(title)(currentUser,events)

  def f:((String) => (Person,List[Event]) => play.twirl.api.HtmlFormat.Appendable) = (title) => (currentUser,events) => apply(title)(currentUser,events)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:16 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/list.scala.html
                  HASH: 6a032cdb6839b3d0dadf755c72d6cd20e216f1ce
                  MATRIX: 741->1|932->58|964->81|994->117|1025->122|1068->139|1086->149|1123->166|1154->171|1225->216|1239->222|1322->284|1608->543|1623->549|1693->598|1773->651|1788->657|1874->722|1954->775|1969->781|2033->824|2113->877|2128->883|2198->932|2461->1168|2516->1202|2552->1211|2616->1248|2633->1256|2689->1291|2739->1313|2808->1355|2823->1361|2868->1385|3478->2071|3543->2121|3604->2154|3739->2262|3775->2282|3814->2283|3875->2316|3957->2371|3972->2377|4021->2405|4051->2408|4065->2413|4092->2419|4166->2466|4212->2503|4251->2504|4320->2545|4364->2562|4396->2585|4435->2586|4464->2587|4486->2591|4499->2596|4538->2598|4552->2603|4601->2630|4631->2631|4673->2641|4735->2685|4748->2690|4787->2691|4856->2733|4881->2749|4920->2750|4993->2795|5037->2812|5069->2835|5108->2836|5137->2837|5159->2841|5172->2846|5202->2848|5217->2853|5269->2881|5299->2882|5330->2885|5361->2906|5401->2907|5431->2908|5454->2912|5468->2917|5499->2919|5514->2924|5564->2950|5594->2951|5670->3009|5683->3014|5722->3015|5795->3060|5827->3065|5859->3088|5898->3089|5927->3090|5949->3094|5962->3099|5992->3101|6006->3106|6063->3139|6145->3194|6175->3215|6214->3216|6243->3217|6265->3221|6278->3226|6308->3228|6322->3233|6377->3264|6455->3311|6524->3349|6589->3386|6671->3441|6686->3447|6737->3477|6931->3644|6946->3650|6995->3678|7170->3822|7227->3851|7533->4130|7548->4136|7608->4175|7670->4210|7685->4216|7766->4276
                  LINES: 26->1|30->1|32->4|32->5|33->6|35->8|35->8|35->8|36->9|36->9|36->9|36->9|39->12|39->12|39->12|40->13|40->13|40->13|41->14|41->14|41->14|42->15|42->15|42->15|49->22|49->22|50->23|51->24|51->24|51->24|53->26|53->26|53->26|53->26|69->42|70->43|71->44|74->47|74->47|74->47|75->48|76->49|76->49|76->49|76->49|76->49|76->49|77->50|77->50|77->50|78->51|78->51|78->51|78->51|78->51|78->51|78->51|78->51|78->51|78->51|78->51|78->51|79->52|79->52|79->52|80->53|80->53|80->53|81->54|81->54|81->54|81->54|81->54|81->54|81->54|81->54|81->54|81->54|81->54|81->54|81->54|81->54|81->54|81->54|81->54|81->54|81->54|81->54|81->54|82->55|82->55|82->55|83->56|83->56|83->56|83->56|83->56|83->56|83->56|83->56|83->56|83->56|84->57|84->57|84->57|84->57|84->57|84->57|84->57|84->57|84->57|85->58|86->59|87->60|88->61|88->61|88->61|91->64|91->64|91->64|94->67|95->68|110->83|110->83|110->83|112->85|112->85|112->85
                  -- GENERATED --
              */
          