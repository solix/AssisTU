
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
object dashboard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Person,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(parentpage: String, currentUser:Person):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import plugins.com.feth.play.module.pa.providers.AuthProvider

Seq[Any](format.raw/*2.42*/("""
    """),format.raw/*4.1*/("""<!-- Navigation -->

<nav class="navbar navbar-default navbar-static-top "  role="navigation" style="margin-bottom: 0">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle " data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
    </div>
    
    <ul class="nav navbar-top-links navbar-left">

    </ul>

    <!-- /.navbar-header -->

    <ul class="nav navbar-top-links navbar-right" id="three">
        <li class="dropdown msg">

            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                <i class="fa fa-comments fa-fw"></i> """),_display_(/*26.55*/if(DiscussionData.allNewComments(currentUser).size()>0)/*26.110*/{_display_(Seq[Any](format.raw/*26.111*/("""<span class="badge badge-info">"""),_display_(/*26.143*/DiscussionData/*26.157*/.allNewComments(currentUser).size()),format.raw/*26.192*/("""</span> """)))}),format.raw/*26.201*/("""<i class="fa fa-caret-down"></i>
            </a>
            <ul class="dropdown-menu dropdown-tasks" style="height: 300px; overflow-y: scroll">
                """),_display_(/*29.18*/if(DiscussionData.allNewComments(currentUser).size() == 0)/*29.76*/{_display_(Seq[Any](format.raw/*29.77*/("""
                    """),format.raw/*30.21*/("""<li>
                        <a href=""""),_display_(/*31.35*/routes/*31.41*/.Application.discussion()),format.raw/*31.66*/("""">
                            <div><strong>No New Comments</strong></div>
                            <div>
                                Nothing to see here!
                            </div>
                        </a>
                    </li>
                """)))}),format.raw/*38.18*/("""
            """),_display_(/*39.14*/defining(DiscussionData.allNewComments(currentUser))/*39.66*/ { comments =>_display_(Seq[Any](format.raw/*39.80*/("""
                """),_display_(/*40.18*/for(comment <- comments) yield /*40.42*/{_display_(Seq[Any](format.raw/*40.43*/("""
                    """),format.raw/*41.21*/("""<li>
                        <a href=""""),_display_(/*42.35*/routes/*42.41*/.DiscussionData.seen(comment.cid)),format.raw/*42.74*/("""">
                            <div>
                                <small class="pull-right text-muted" style="margin: 2px">
                                    <i class="fa fa-clock-o fa-fw" title=""""),_display_(/*45.76*/comment/*45.83*/.date),format.raw/*45.88*/(""""></i>
                                </small>
                                <strong>"""),_display_(/*47.42*/comment/*47.49*/.subject),format.raw/*47.57*/("""</strong>
                                """),_display_(/*48.34*/if(comment.content.size <= 10)/*48.64*/{_display_(Seq[Any](format.raw/*48.65*/("""
                                    """),format.raw/*49.37*/("""<p>"""),_display_(/*49.41*/comment/*49.48*/.person.name),format.raw/*49.60*/(""" """),format.raw/*49.61*/("""says: """),_display_(/*49.68*/comment/*49.75*/.content),format.raw/*49.83*/("""</p>
                                """)))}/*50.35*/else/*50.40*/{_display_(Seq[Any](format.raw/*50.41*/("""
                                    """),format.raw/*51.37*/("""<p>"""),_display_(/*51.41*/comment/*51.48*/.person.name),format.raw/*51.60*/(""" """),format.raw/*51.61*/("""says: """),_display_(/*51.68*/comment/*51.75*/.content.substring(0, 10)),format.raw/*51.100*/("""...</p>
                                """)))}),format.raw/*52.34*/("""
                            """),format.raw/*53.29*/("""</div>
                        </a>
                    </li>
                    <li class="divider"></li>
                """)))}),format.raw/*57.18*/("""
            """)))}),format.raw/*58.14*/("""
            """),format.raw/*59.13*/("""</ul>

                <!-- /.dropdown-tasks -->
        </li>
            <!-- /.dropdown -->
        <!--TASKS-->
        <li class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                <i class="fa fa-wrench fa-fw"></i> """),_display_(/*67.53*/if(Task.allUndoneTask(currentUser).size()>0)/*67.97*/{_display_(Seq[Any](format.raw/*67.98*/("""<span class="badge badge-info">"""),_display_(/*67.130*/Task/*67.134*/.allUndoneTask(currentUser).size()),format.raw/*67.168*/("""</span> """)))}),format.raw/*67.177*/("""<i class="fa fa-caret-down"></i>
            </a>
            <ul class="dropdown-menu dropdown-tasks" style="height: 300px; overflow-y: scroll">
                """),_display_(/*70.18*/if(Task.allUndoneTask(currentUser).size() == 0)/*70.65*/{_display_(Seq[Any](format.raw/*70.66*/("""
                """),format.raw/*71.17*/("""<li>
                    <a href=""""),_display_(/*72.31*/routes/*72.37*/.Application.task()),format.raw/*72.56*/("""">
                        <div><strong>No Tasks</strong></div>
                        <div>
                             Make a new one or give yourself an applause!

                        </div>
                    </a>
                </li>
            """)))}),format.raw/*80.14*/("""
                """),_display_(/*81.18*/Task/*81.22*/.allUndoneTask(currentUser).map/*81.53*/ { t =>_display_(Seq[Any](format.raw/*81.60*/("""
                    """),format.raw/*82.21*/("""<li>
                        <a href=""""),_display_(/*83.35*/routes/*83.41*/.Application.task()),format.raw/*83.60*/("""">
                            <div>
                                <p>
                                    <strong>"""),_display_(/*86.46*/t/*86.47*/.name),format.raw/*86.52*/("""</strong>
                                    <span class="pull-right text-muted">Due : """),_display_(/*87.80*/t/*87.81*/.dueDate.toString.substring(0,10)),format.raw/*87.114*/("""</span>
                                </p>


                            </div>


                        </a>
                    </li>
                    <li class="divider"></li>
                """)))}),format.raw/*97.18*/("""
            """),format.raw/*98.13*/("""</ul>

            <!-- /.dropdown-tasks -->
        </li>
        <!-- /.dropdown -->
        """),format.raw/*103.34*/("""
            """),format.raw/*104.76*/("""
                """),format.raw/*105.87*/("""
            """),format.raw/*106.21*/("""
            """),format.raw/*107.59*/("""
                """),format.raw/*108.25*/("""
                    """),format.raw/*109.37*/("""
                        """),format.raw/*110.34*/("""
                            """),format.raw/*111.80*/("""
                            """),format.raw/*112.95*/("""
                        """),format.raw/*113.35*/("""
                    """),format.raw/*114.29*/("""
                """),format.raw/*115.26*/("""
                """),format.raw/*116.46*/("""
                """),format.raw/*117.25*/("""
                    """),format.raw/*118.37*/("""
                        """),format.raw/*119.34*/("""
                            """),format.raw/*120.84*/("""
                            """),format.raw/*121.96*/("""
                        """),format.raw/*122.35*/("""
                    """),format.raw/*123.29*/("""
                """),format.raw/*124.26*/("""
                """),format.raw/*125.46*/("""
                """),format.raw/*126.25*/("""
                    """),format.raw/*127.37*/("""
                        """),format.raw/*128.34*/("""
                            """),format.raw/*129.82*/("""
                            """),format.raw/*130.95*/("""
                        """),format.raw/*131.35*/("""
                    """),format.raw/*132.29*/("""
                """),format.raw/*133.26*/("""
                """),format.raw/*134.46*/("""
                """),format.raw/*135.25*/("""
                    """),format.raw/*136.37*/("""
                        """),format.raw/*137.34*/("""
                            """),format.raw/*138.75*/("""
                            """),format.raw/*139.95*/("""
                        """),format.raw/*140.35*/("""
                    """),format.raw/*141.29*/("""
                """),format.raw/*142.26*/("""
                """),format.raw/*143.46*/("""
                """),format.raw/*144.25*/("""
                    """),format.raw/*145.37*/("""
                        """),format.raw/*146.34*/("""
                            """),format.raw/*147.83*/("""
                            """),format.raw/*148.95*/("""
                        """),format.raw/*149.35*/("""
                    """),format.raw/*150.29*/("""
                """),format.raw/*151.26*/("""
                """),format.raw/*152.46*/("""
                """),format.raw/*153.25*/("""
                    """),format.raw/*154.57*/("""
                        """),format.raw/*155.60*/("""
                        """),format.raw/*156.62*/("""
                    """),format.raw/*157.29*/("""
                """),format.raw/*158.26*/("""
            """),format.raw/*159.22*/("""
            """),format.raw/*160.43*/("""
        """),format.raw/*161.18*/("""
        """),format.raw/*162.9*/("""<!-- /.dropdown -->
        <li class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                 <i class="fa fa-user fa-fw"></i> <span > """),_display_(/*165.60*/currentUser/*165.71*/.name),format.raw/*165.76*/(""" """),format.raw/*165.77*/("""</span> <i class="fa fa-caret-down"></i>
            </a>
            <ul class="dropdown-menu dropdown-user">
                <li>
                    <a href=""""),_display_(/*169.31*/AuthProvider/*169.43*/.Registry.get("mendeley").getUrl()),format.raw/*169.77*/("""">
                        """),_display_(/*170.26*/if(currentUser.mendeleyConnected)/*170.59*/{_display_(Seq[Any](format.raw/*170.60*/("""
                            """),format.raw/*171.29*/("""<img src=""""),_display_(/*171.40*/routes/*171.46*/.Assets.at("icons/mendeley-24-black.png")),format.raw/*171.87*/("""" style="margin-left: -3px; padding-right: 1px">Sync Mendeley Library...
                        """)))}/*172.26*/else/*172.30*/{_display_(Seq[Any](format.raw/*172.31*/("""
                            """),format.raw/*173.29*/("""<img src=""""),_display_(/*173.40*/routes/*173.46*/.Assets.at("icons/mendeley-24-black.png")),format.raw/*173.87*/("""" style="margin-left: -3px; padding-right: 1px">Link Mendeley Library...
                        """)))}),format.raw/*174.26*/("""
                    """),format.raw/*175.21*/("""</a>
                </li>
                <li><a href="#" data-toggle="modal" data-target="#deleteAccount"><i class="fa fa-close fa-fw"></i> Delete account...</a>
                </li>
                <li class="divider"></li>
                <li><a href=""""),_display_(/*180.31*/routes/*180.37*/.Authentication.OAuthLogout),format.raw/*180.64*/(""""><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                </li>
            </ul>
            <!-- /.dropdown-user -->
        </li>

        <!-- /.dropdown -->
    </ul>
    """),format.raw/*188.42*/("""
    """),_display_(/*189.6*/template/*189.14*/.smallmodal("deleteAccount")/*189.42*/("danger")/*189.52*/("Delete account " + currentUser.name)/*189.90*/ {_display_(Seq[Any](format.raw/*189.92*/("""
        """),format.raw/*190.9*/("""<p style="text-align: center">Are you sure you want to delete account """),_display_(/*190.80*/currentUser/*190.91*/.name),format.raw/*190.96*/("""?</p>
        <div class="btn-group col-xs-6" role="group" style="margin:20px 0px 0px 0px">
            <a type="button" class="btn btn-default col-xs-12" data-dismiss="modal">Cancel</a>
        </div>
        <div class="btn-group col-xs-6" role="group" style="margin:20px 0px 0px 0px">
            <a class="btn btn-danger col-xs-12" href=""""),_display_(/*195.56*/routes/*195.62*/.PersonData.deleteAccount()),format.raw/*195.89*/("""">Delete me!</a>
        </div>
    """)))}),format.raw/*197.6*/("""
    """),format.raw/*198.5*/("""<!-- /.navbar-top-links -->
    <!-- Side Bar -->
    <div class="navbar-default sidebar"  role="navigation">
        <div class="sidebar-nav navbar-collapse">
            <script>
            (function() """),format.raw/*203.25*/("""{"""),format.raw/*203.26*/("""
            """),format.raw/*204.13*/("""var cx = '015131041368954121162:l0lfe2cxh70';
            var gcse = document.createElement('script');
            gcse.type = 'text/javascript';
            gcse.async = true;
            gcse.src = (document.location.protocol == 'https:' ? 'https:' : 'http:') +
            '//www.google.com/cse/cse.js?cx=' + cx;
            var s = document.getElementsByTagName('script')[0];
            s.parentNode.insertBefore(gcse, s);
            """),format.raw/*212.13*/("""}"""),format.raw/*212.14*/(""")();
//            jQuery(".gsc-input").attr("placeholder", "Rechercher");
            </script>
            <ul class="nav nav-tabs nav-stacked two" id="side-menu">
                <li class="sidebar-search">
                        <label style="color: #1f6377 ; font-size: smaller; ">Search an article: </label>
                    <gcse:searchbox-only></gcse:searchbox-only>

               </li>
                <li>
                    <a """),_display_(/*222.25*/if(parentpage.equals("dashboard"))/*222.59*/{_display_(Seq[Any](format.raw/*222.60*/("""class="active"""")))}),format.raw/*222.75*/(""" """),format.raw/*222.76*/("""href=""""),_display_(/*222.83*/routes/*222.89*/.Application.index()),format.raw/*222.109*/(""""><i class="fa fa-tachometer fa-fw"></i> Dashboard</a>
                </li>
                <li id="four">
                    <a """),_display_(/*225.25*/if(parentpage.equals("project"))/*225.57*/{_display_(Seq[Any](format.raw/*225.58*/("""class="active"""")))}),format.raw/*225.73*/(""" """),format.raw/*225.74*/("""href=""""),_display_(/*225.81*/routes/*225.87*/.Application.project()),format.raw/*225.109*/(""""><i class="fa fa-line-chart fa-fw" ></i> Projects</a>

                    <!-- /.nav-second-level -->

                </li>
                <li id="five">
                    <a """),_display_(/*231.25*/if(parentpage.equals("calendar"))/*231.58*/{_display_(Seq[Any](format.raw/*231.59*/("""class="active"""")))}),format.raw/*231.74*/(""" """),format.raw/*231.75*/("""href=""""),_display_(/*231.82*/routes/*231.88*/.CalendarData.calendar()),format.raw/*231.112*/(""""><i class="fa fa-calendar fa-fw" ></i> Calendar</a>
                </li>
                <li id="six">
                    <a """),_display_(/*234.25*/if(parentpage.equals("discussion"))/*234.60*/{_display_(Seq[Any](format.raw/*234.61*/("""class="active"""")))}),format.raw/*234.76*/(""" """),format.raw/*234.77*/("""href=""""),_display_(/*234.84*/routes/*234.90*/.Application.discussion()),format.raw/*234.115*/(""""><i class="fa fa-comments fa-fw"i ></i> Discussions</a>

                </li>
                <li id="seven">
                    <a """),_display_(/*238.25*/if(parentpage.equals("task"))/*238.54*/{_display_(Seq[Any](format.raw/*238.55*/("""class="active"""")))}),format.raw/*238.70*/(""" """),format.raw/*238.71*/("""href=""""),_display_(/*238.78*/routes/*238.84*/.Application.task()),format.raw/*238.103*/(""""><i class="fa fa-wrench fa-fw" ></i> Tasks</a>

                    <!-- /.nav-second-level -->
                </li>
                <li id="eight">
                    <a """),_display_(/*243.25*/if(parentpage.equals("suggestion"))/*243.60*/{_display_(Seq[Any](format.raw/*243.61*/("""class="active"""")))}),format.raw/*243.76*/(""" """),format.raw/*243.77*/("""href=""""),_display_(/*243.84*/routes/*243.90*/.Application.suggestions()),format.raw/*243.116*/(""""><i class="fa fa-lightbulb-o fa-fw" ></i> Suggestions & Tips</a>

                    <!-- /.nav-second-level -->
                </li>
            </ul>
        </div>
        <!-- /.sidebar-collapse -->
    </div>
    <!-- /.navbar-static-side -->
</nav>
"""))}
  }

  def render(parentpage:String,currentUser:Person): play.twirl.api.HtmlFormat.Appendable = apply(parentpage,currentUser)

  def f:((String,Person) => play.twirl.api.HtmlFormat.Appendable) = (parentpage,currentUser) => apply(parentpage,currentUser)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/dashboard.scala.html
                  HASH: b70b616fec945bc2afc3a63451e4b02f5a9dc25e
                  MATRIX: 734->2|923->42|954->110|1778->907|1843->962|1883->963|1943->995|1967->1009|2024->1044|2065->1053|2255->1216|2322->1274|2361->1275|2410->1296|2476->1335|2491->1341|2537->1366|2837->1635|2878->1649|2939->1701|2991->1715|3036->1733|3076->1757|3115->1758|3164->1779|3230->1818|3245->1824|3299->1857|3528->2059|3544->2066|3570->2071|3686->2160|3702->2167|3731->2175|3801->2218|3840->2248|3879->2249|3944->2286|3975->2290|3991->2297|4024->2309|4053->2310|4087->2317|4103->2324|4132->2332|4189->2371|4202->2376|4241->2377|4306->2414|4337->2418|4353->2425|4386->2437|4415->2438|4449->2445|4465->2452|4512->2477|4584->2518|4641->2547|4797->2672|4842->2686|4883->2699|5180->2969|5233->3013|5272->3014|5332->3046|5346->3050|5402->3084|5443->3093|5633->3256|5689->3303|5728->3304|5773->3321|5835->3356|5850->3362|5890->3381|6181->3641|6226->3659|6239->3663|6279->3694|6324->3701|6373->3722|6439->3761|6454->3767|6494->3786|6639->3904|6649->3905|6675->3910|6791->3999|6801->4000|6856->4033|7089->4235|7130->4248|7254->4368|7296->4444|7342->4531|7384->4552|7426->4611|7472->4636|7522->4673|7576->4707|7634->4787|7692->4882|7746->4917|7796->4946|7842->4972|7888->5018|7934->5043|7984->5080|8038->5114|8096->5198|8154->5294|8208->5329|8258->5358|8304->5384|8350->5430|8396->5455|8446->5492|8500->5526|8558->5608|8616->5703|8670->5738|8720->5767|8766->5793|8812->5839|8858->5864|8908->5901|8962->5935|9020->6010|9078->6105|9132->6140|9182->6169|9228->6195|9274->6241|9320->6266|9370->6303|9424->6337|9482->6420|9540->6515|9594->6550|9644->6579|9690->6605|9736->6651|9782->6676|9832->6733|9886->6793|9940->6855|9990->6884|10036->6910|10078->6932|10120->6975|10158->6993|10195->7002|10404->7183|10425->7194|10452->7199|10482->7200|10672->7362|10694->7374|10750->7408|10806->7436|10849->7469|10889->7470|10947->7499|10986->7510|11002->7516|11065->7557|11183->7655|11197->7659|11237->7660|11295->7689|11334->7700|11350->7706|11413->7747|11543->7845|11593->7866|11879->8124|11895->8130|11944->8157|12157->8378|12190->8384|12208->8392|12246->8420|12266->8430|12314->8468|12355->8470|12392->8479|12491->8550|12512->8561|12539->8566|12910->8909|12926->8915|12975->8942|13043->8979|13076->8984|13310->9189|13340->9190|13382->9203|13851->9643|13881->9644|14355->10090|14399->10124|14439->10125|14486->10140|14516->10141|14551->10148|14567->10154|14610->10174|14770->10306|14812->10338|14852->10339|14899->10354|14929->10355|14964->10362|14980->10368|15025->10390|15235->10572|15278->10605|15318->10606|15365->10621|15395->10622|15430->10629|15446->10635|15493->10659|15650->10788|15695->10823|15735->10824|15782->10839|15812->10840|15847->10847|15863->10853|15911->10878|16075->11014|16114->11043|16154->11044|16201->11059|16231->11060|16266->11067|16282->11073|16324->11092|16527->11267|16572->11302|16612->11303|16659->11318|16689->11319|16724->11326|16740->11332|16789->11358
                  LINES: 26->2|29->2|30->4|52->26|52->26|52->26|52->26|52->26|52->26|52->26|55->29|55->29|55->29|56->30|57->31|57->31|57->31|64->38|65->39|65->39|65->39|66->40|66->40|66->40|67->41|68->42|68->42|68->42|71->45|71->45|71->45|73->47|73->47|73->47|74->48|74->48|74->48|75->49|75->49|75->49|75->49|75->49|75->49|75->49|75->49|76->50|76->50|76->50|77->51|77->51|77->51|77->51|77->51|77->51|77->51|77->51|78->52|79->53|83->57|84->58|85->59|93->67|93->67|93->67|93->67|93->67|93->67|93->67|96->70|96->70|96->70|97->71|98->72|98->72|98->72|106->80|107->81|107->81|107->81|107->81|108->82|109->83|109->83|109->83|112->86|112->86|112->86|113->87|113->87|113->87|123->97|124->98|129->103|130->104|131->105|132->106|133->107|134->108|135->109|136->110|137->111|138->112|139->113|140->114|141->115|142->116|143->117|144->118|145->119|146->120|147->121|148->122|149->123|150->124|151->125|152->126|153->127|154->128|155->129|156->130|157->131|158->132|159->133|160->134|161->135|162->136|163->137|164->138|165->139|166->140|167->141|168->142|169->143|170->144|171->145|172->146|173->147|174->148|175->149|176->150|177->151|178->152|179->153|180->154|181->155|182->156|183->157|184->158|185->159|186->160|187->161|188->162|191->165|191->165|191->165|191->165|195->169|195->169|195->169|196->170|196->170|196->170|197->171|197->171|197->171|197->171|198->172|198->172|198->172|199->173|199->173|199->173|199->173|200->174|201->175|206->180|206->180|206->180|214->188|215->189|215->189|215->189|215->189|215->189|215->189|216->190|216->190|216->190|216->190|221->195|221->195|221->195|223->197|224->198|229->203|229->203|230->204|238->212|238->212|248->222|248->222|248->222|248->222|248->222|248->222|248->222|248->222|251->225|251->225|251->225|251->225|251->225|251->225|251->225|251->225|257->231|257->231|257->231|257->231|257->231|257->231|257->231|257->231|260->234|260->234|260->234|260->234|260->234|260->234|260->234|260->234|264->238|264->238|264->238|264->238|264->238|264->238|264->238|264->238|269->243|269->243|269->243|269->243|269->243|269->243|269->243|269->243
                  -- GENERATED --
              */
          