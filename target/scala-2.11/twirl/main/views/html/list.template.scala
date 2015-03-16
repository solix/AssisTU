
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
        """),_display_(/*7.10*/linkLoader/*7.20*/.headlinks(title)),format.raw/*7.37*/("""
        """),format.raw/*8.9*/("""<link rel="stylesheet" media="screen" href='"""),_display_(/*8.54*/routes/*8.60*/.Assets.at("fullcalendar-1.5.3/fullcalendar/fullcalendar.css")),format.raw/*8.122*/("""'>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.18/jquery-ui.min.js" type="text/javascript"></script>
        <script src='"""),_display_(/*11.23*/routes/*11.29*/.Assets.at("bootstrap-2.0.2/js/bootstrap.min.js")),format.raw/*11.78*/("""' type="text/javascript"></script>
        <script src='"""),_display_(/*12.23*/routes/*12.29*/.Assets.at("fullcalendar-1.5.3/fullcalendar/fullcalendar.min.js")),format.raw/*12.94*/("""' type="text/javascript"></script>
        <script src='"""),_display_(/*13.23*/routes/*13.29*/.Assets.at("javascripts/renderCalendar.js")),format.raw/*13.72*/("""' type="text/javascript"></script>
        <script src='"""),_display_(/*14.23*/routes/*14.29*/.Assets.at("bootstrap-2.0.2/js/bootstrap.min.js")),format.raw/*14.78*/("""' type="text/javascript"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.13.1/jquery.validate.min.js" type="text/javascript"></script>
    </head>
    <body>

        <div id="wrapper">
            """),_display_(/*20.14*/dashboard("calendar", currentUser)),format.raw/*20.48*/("""
        """),format.raw/*21.9*/("""<div id="page-wrapper">
            """),_display_(/*22.14*/template/*22.22*/.headericon("fa fa-calendar fa-5x")),format.raw/*22.57*/("""

                    """),format.raw/*24.21*/("""<a  class="btn btn-default btn=sm" href=""""),_display_(/*24.63*/routes/*24.69*/.CalendarData.calendar()),format.raw/*24.93*/("""">
                        <span class="fa fa-calendar"></span> Back to Calendar
                    </a>

            <hr class="hr" style="margin-top: 10px">

                <div class="well" >
                        <h2>Event's list</h2>
                        <table class="table table-striped table-bordered">
                            <thead>
                                <tr>
                                    <th  >Event</th>
                                    <th >From</th>
                                    <th >To</th>
                                </tr>
                            </thead>
                            <tbody>
                            """),_display_(/*41.30*/for(event <- events) yield /*41.50*/{_display_(Seq[Any](format.raw/*41.51*/("""
                                """),format.raw/*42.33*/("""<tr>
                                    <td><a href=""""),_display_(/*43.51*/routes/*43.57*/.CalendarData.edit(event.id)),format.raw/*43.85*/("""">"""),_display_(/*43.88*/event/*43.93*/.title),format.raw/*43.99*/("""</a></td>
                                    """),_display_(/*44.38*/if(event.allDay && event.endsSameDay)/*44.75*/{_display_(Seq[Any](format.raw/*44.76*/("""
                                        """),format.raw/*45.41*/("""<td colspan="2">"""),_display_(/*45.58*/if(event.start_date == null)/*45.86*/{_display_(Seq[Any](format.raw/*45.87*/(""" """),format.raw/*45.88*/("""- """)))}/*45.92*/else/*45.97*/{_display_(Seq[Any](_display_(/*45.99*/event/*45.104*/.start_date.format("dd.MM.yyyy")),format.raw/*45.136*/(""" """),format.raw/*45.137*/("""(All day)""")))}),format.raw/*45.147*/("""</td>
                                    """)))}/*46.39*/else/*46.44*/{_display_(Seq[Any](format.raw/*46.45*/("""
                                        """),_display_(/*47.42*/if(event.allDay)/*47.58*/{_display_(Seq[Any](format.raw/*47.59*/("""
                                            """),format.raw/*48.45*/("""<td colspan="2">"""),_display_(/*48.62*/if(event.start_date == null)/*48.90*/{_display_(Seq[Any](format.raw/*48.91*/(""" """),format.raw/*48.92*/("""- """)))}/*48.96*/else/*48.101*/{_display_(_display_(/*48.103*/event/*48.108*/.start_date.format("dd.MM.yyyy")))}),format.raw/*48.141*/(""" """),format.raw/*48.142*/("""- """),_display_(/*48.145*/if(event.end_date == null)/*48.171*/{_display_(Seq[Any](format.raw/*48.172*/(""" """),format.raw/*48.173*/("""- """)))}/*48.177*/else/*48.182*/{_display_(_display_(/*48.184*/event/*48.189*/.end_date.format("dd.MM.yyyy")))}),format.raw/*48.220*/(""" """),format.raw/*48.221*/("""(All days)</td>
                                        """)))}/*49.43*/else/*49.48*/{_display_(Seq[Any](format.raw/*49.49*/("""
                                            """),format.raw/*50.45*/("""<td>"""),_display_(/*50.50*/if(event.start_date == null)/*50.78*/{_display_(Seq[Any](format.raw/*50.79*/(""" """),format.raw/*50.80*/("""- """)))}/*50.84*/else/*50.89*/{_display_(_display_(/*50.91*/event/*50.96*/.start_date.format("dd.MM.yyyy H:mm")))}),format.raw/*50.134*/("""</td>
                                            <td>"""),_display_(/*51.50*/if(event.end_date == null)/*51.76*/{_display_(Seq[Any](format.raw/*51.77*/(""" """),format.raw/*51.78*/("""- """)))}/*51.82*/else/*51.87*/{_display_(_display_(/*51.89*/event/*51.94*/.end_date.format("dd.MM.yyyy H:mm")))}),format.raw/*51.130*/("""</td>
                                        """)))}),format.raw/*52.42*/("""
                                    """)))}),format.raw/*53.38*/("""
                                    """),format.raw/*54.37*/("""<td>
                                        <a href=""""),_display_(/*55.51*/routes/*55.57*/.CalendarData.delete(event.id)),format.raw/*55.87*/(""""><i class="fa fa-trash"></i></a>
                                    </td>
                                    <td>
                                        <a href=""""),_display_(/*58.51*/routes/*58.57*/.CalendarData.edit(event.id)),format.raw/*58.85*/(""""><i class="fa fa-pencil"></i></a>
                                    </td>
                                </tr>
                            """)))}),format.raw/*61.30*/("""
                            """),format.raw/*62.29*/("""</tbody>
                        </table>
                    </div>
            </div>
        </div>

            <!--bootstrap-->
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
            <!--sb-Admin-->
        <script src=""""),_display_(/*71.23*/routes/*71.29*/.Assets.at("javascripts/sb-admin-2.js")),format.raw/*71.68*/(""""></script>

        <script src=""""),_display_(/*73.23*/routes/*73.29*/.Assets.at("javascripts/plugins/metisMenu/metisMenu.min.js")),format.raw/*73.89*/(""""></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tour/0.10.1/js/bootstrap-tour.min.js"></script>
        <script src=""""),_display_(/*75.23*/routes/*75.29*/.Assets.at("javascripts/walkthrough.js")),format.raw/*75.69*/(""""></script>

    </body>
"""))}
  }

  def render(title:String,currentUser:Person,events:List[Event]): play.twirl.api.HtmlFormat.Appendable = apply(title)(currentUser,events)

  def f:((String) => (Person,List[Event]) => play.twirl.api.HtmlFormat.Appendable) = (title) => (currentUser,events) => apply(title)(currentUser,events)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/list.scala.html
                  HASH: e4043216948cf2208f6ec6abc1fa3438ad514ef9
                  MATRIX: 741->1|932->58|964->81|994->117|1025->122|1067->138|1085->148|1122->165|1157->174|1228->219|1242->225|1325->287|1623->558|1638->564|1708->613|1792->670|1807->676|1893->741|1977->798|1992->804|2056->847|2140->904|2155->910|2225->959|2491->1198|2546->1232|2582->1241|2646->1278|2663->1286|2719->1321|2769->1343|2838->1385|2853->1391|2898->1415|3609->2099|3645->2119|3684->2120|3745->2153|3827->2208|3842->2214|3891->2242|3921->2245|3935->2250|3962->2256|4036->2303|4082->2340|4121->2341|4190->2382|4234->2399|4271->2427|4310->2428|4339->2429|4361->2433|4374->2438|4413->2440|4428->2445|4482->2477|4512->2478|4554->2488|4616->2532|4629->2537|4668->2538|4737->2580|4762->2596|4801->2597|4874->2642|4918->2659|4955->2687|4994->2688|5023->2689|5045->2693|5059->2698|5090->2700|5105->2705|5162->2738|5192->2739|5223->2742|5259->2768|5299->2769|5329->2770|5352->2774|5366->2779|5397->2781|5412->2786|5467->2817|5497->2818|5573->2876|5586->2881|5625->2882|5698->2927|5730->2932|5767->2960|5806->2961|5835->2962|5857->2966|5870->2971|5900->2973|5914->2978|5976->3016|6058->3071|6093->3097|6132->3098|6161->3099|6183->3103|6196->3108|6226->3110|6240->3115|6300->3151|6378->3198|6447->3236|6512->3273|6594->3328|6609->3334|6660->3364|6854->3531|6869->3537|6918->3565|7093->3709|7150->3738|7454->4015|7469->4021|7529->4060|7591->4095|7606->4101|7687->4161|7866->4313|7881->4319|7942->4359
                  LINES: 26->1|30->1|32->4|32->5|33->6|34->7|34->7|34->7|35->8|35->8|35->8|35->8|38->11|38->11|38->11|39->12|39->12|39->12|40->13|40->13|40->13|41->14|41->14|41->14|47->20|47->20|48->21|49->22|49->22|49->22|51->24|51->24|51->24|51->24|68->41|68->41|68->41|69->42|70->43|70->43|70->43|70->43|70->43|70->43|71->44|71->44|71->44|72->45|72->45|72->45|72->45|72->45|72->45|72->45|72->45|72->45|72->45|72->45|72->45|73->46|73->46|73->46|74->47|74->47|74->47|75->48|75->48|75->48|75->48|75->48|75->48|75->48|75->48|75->48|75->48|75->48|75->48|75->48|75->48|75->48|75->48|75->48|75->48|75->48|75->48|75->48|76->49|76->49|76->49|77->50|77->50|77->50|77->50|77->50|77->50|77->50|77->50|77->50|77->50|78->51|78->51|78->51|78->51|78->51|78->51|78->51|78->51|78->51|79->52|80->53|81->54|82->55|82->55|82->55|85->58|85->58|85->58|88->61|89->62|98->71|98->71|98->71|100->73|100->73|100->73|102->75|102->75|102->75
                  -- GENERATED --
              */
          