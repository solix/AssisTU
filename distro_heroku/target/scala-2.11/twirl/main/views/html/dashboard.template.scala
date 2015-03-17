
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
  def apply/*1.2*/(parentpage: String, currentUser:Person):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.42*/("""
"""),format.raw/*2.1*/("""<!-- Navigation -->

<nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
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

    <ul class="nav navbar-top-links navbar-right">
        <li class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                <i class="fa fa-comments fa-fw"></i>  <i class="fa fa-caret-down"></i>
            </a>
            <ul class="dropdown-menu dropdown-messages">
                <li>
                    <a href="#">
                        <div>
                            <strong>John Smith</strong>
                                    <span class="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                        </div>
                        <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                    </a>
                </li>
                <li class="divider"></li>
                <li>
                    <a href="#">
                        <div>
                            <strong>John Smith</strong>
                                    <span class="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                        </div>
                        <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                    </a>
                </li>
                <li class="divider"></li>
                <li>
                    <a href="#">
                        <div>
                            <strong>John Smith</strong>
                                    <span class="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                        </div>
                        <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                    </a>
                </li>
                <li class="divider"></li>
                <li>
                    <a class="text-center" href="#">
                        <strong>Read All Messages</strong>
                        <i class="fa fa-angle-right"></i>
                    </a>
                </li>
            </ul>
            <!-- /.dropdown-messages -->
        </li>
        <!-- /.dropdown -->
        <li class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                <i class="fa fa-wrench fa-fw"></i>  <i class="fa fa-caret-down"></i>
            </a>
            <ul class="dropdown-menu dropdown-tasks">
                <li>
                    <a href="#">
                        <div>
                            <p>
                                <strong>Task 1</strong>
                                <span class="pull-right text-muted">40% Complete</span>
                            </p>
                            <div class="progress progress-striped active">
                                <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                    <span class="sr-only">40% Complete (success)</span>
                                </div>
                            </div>
                        </div>
                    </a>
                </li>
                <li class="divider"></li>
                <li>
                    <a href="#">
                        <div>
                            <p>
                                <strong>Task 2</strong>
                                <span class="pull-right text-muted">20% Complete</span>
                            </p>
                            <div class="progress progress-striped active">
                                <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
                                    <span class="sr-only">20% Complete</span>
                                </div>
                            </div>
                        </div>
                    </a>
                </li>
                <li class="divider"></li>
                <li>
                    <a href="#">
                        <div>
                            <p>
                                <strong>Task 3</strong>
                                <span class="pull-right text-muted">60% Complete</span>
                            </p>
                            <div class="progress progress-striped active">
                                <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                                    <span class="sr-only">60% Complete (warning)</span>
                                </div>
                            </div>
                        </div>
                    </a>
                </li>
                <li class="divider"></li>
                <li>
                    <a href="#">
                        <div>
                            <p>
                                <strong>Task 4</strong>
                                <span class="pull-right text-muted">80% Complete</span>
                            </p>
                            <div class="progress progress-striped active">
                                <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
                                    <span class="sr-only">80% Complete (danger)</span>
                                </div>
                            </div>
                        </div>
                    </a>
                </li>
                <li class="divider"></li>
                <li>
                    <a class="text-center" href="#">
                        <strong>See All Tasks</strong>
                        <i class="fa fa-angle-right"></i>
                    </a>
                </li>
            </ul>
            <!-- /.dropdown-tasks -->
        </li>
        <!-- /.dropdown -->
        <li class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                <i class="fa fa-bell fa-fw"></i>  <i class="fa fa-caret-down"></i>
            </a>
            <ul class="dropdown-menu dropdown-alerts">
                <li>
                    <a href="#">
                        <div>
                            <i class="fa fa-comment fa-fw"></i> New Comment
                            <span class="pull-right text-muted small">4 minutes ago</span>
                        </div>
                    </a>
                </li>
                <li class="divider"></li>
                <li>
                    <a href="#">
                        <div>
                            <i class="fa fa-twitter fa-fw"></i> 3 New Followers
                            <span class="pull-right text-muted small">12 minutes ago</span>
                        </div>
                    </a>
                </li>
                <li class="divider"></li>
                <li>
                    <a href="#">
                        <div>
                            <i class="fa fa-envelope fa-fw"></i> Message Sent
                            <span class="pull-right text-muted small">4 minutes ago</span>
                        </div>
                    </a>
                </li>
                <li class="divider"></li>
                <li>
                    <a href="#">
                        <div>
                            <i class="fa fa-tasks fa-fw"></i> New Task
                            <span class="pull-right text-muted small">4 minutes ago</span>
                        </div>
                    </a>
                </li>
                <li class="divider"></li>
                <li>
                    <a href="#">
                        <div>
                            <i class="fa fa-upload fa-fw"></i> Server Rebooted
                            <span class="pull-right text-muted small">4 minutes ago</span>
                        </div>
                    </a>
                </li>
                <li class="divider"></li>
                <li>
                    <a class="text-center" href="#">
                        <strong>See All Alerts</strong>
                        <i class="fa fa-angle-right"></i>
                    </a>
                </li>
            </ul>
            <!-- /.dropdown-alerts -->
        </li>
        <!-- /.dropdown -->
        <li class="dropdown">
            <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                 <i class="fa fa-user fa-fw"></i> <span > """),_display_(/*213.60*/currentUser/*213.71*/.name),format.raw/*213.76*/(""" """),format.raw/*213.77*/("""</span> <i class="fa fa-caret-down"></i>
            </a>
            <ul class="dropdown-menu dropdown-user">
                <li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
                </li>
                <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                </li>
                <li class="divider"></li>
                <li><a href=""""),_display_(/*221.31*/routes/*221.37*/.Authentication.OAuthLogout),format.raw/*221.64*/(""""><i class="fa fa-sign-out fa-fw"></i> Logout</a>
                </li>
            </ul>
            <!-- /.dropdown-user -->
        </li>

        <!-- /.dropdown -->
    </ul>
    <!-- /.navbar-top-links -->
    <!-- Side Bar -->
    <div class="navbar-default sidebar" role="navigation">
        <div class="sidebar-nav navbar-collapse">
            <script>
            (function() """),format.raw/*234.25*/("""{"""),format.raw/*234.26*/("""
            """),format.raw/*235.13*/("""var cx = '015131041368954121162:l0lfe2cxh70';
            var gcse = document.createElement('script');
            gcse.type = 'text/javascript';
            gcse.async = true;
            gcse.src = (document.location.protocol == 'https:' ? 'https:' : 'http:') +
            '//www.google.com/cse/cse.js?cx=' + cx;
            var s = document.getElementsByTagName('script')[0];
            s.parentNode.insertBefore(gcse, s);
            """),format.raw/*243.13*/("""}"""),format.raw/*243.14*/(""")();
//            jQuery(".gsc-input").attr("placeholder", "Rechercher");
            </script>
            <ul class="nav nav-tabs nav-stacked" id="side-menu">
                <li class="sidebar-search">
                    <gcse:searchbox-only></gcse:searchbox-only>

                    """),format.raw/*250.56*/("""
                            """),format.raw/*251.78*/("""
                                """),format.raw/*252.70*/("""
                                """),format.raw/*253.122*/("""
                                """),format.raw/*254.74*/("""
                                    """),format.raw/*255.68*/("""
                                        """),format.raw/*256.93*/("""
                                    """),format.raw/*257.52*/("""
                                """),format.raw/*258.44*/("""
                                """),format.raw/*259.43*/("""
                            """),format.raw/*260.39*/("""
                        """),format.raw/*261.35*/("""
                    
               """),format.raw/*263.16*/("""</li>
                
                
                <li>
                    <a """),_display_(/*267.25*/if(parentpage.equals("dashboard"))/*267.59*/{_display_(Seq[Any](format.raw/*267.60*/("""class="active"""")))}),format.raw/*267.75*/(""" """),format.raw/*267.76*/("""href=""""),_display_(/*267.83*/routes/*267.89*/.Application.index()),format.raw/*267.109*/(""""><i class="fa fa-tachometer fa-fw"></i> Dashboard</a>
                </li>
                <li>
                    <a """),_display_(/*270.25*/if(parentpage.equals("project"))/*270.57*/{_display_(Seq[Any](format.raw/*270.58*/("""class="active"""")))}),format.raw/*270.73*/(""" """),format.raw/*270.74*/("""href=""""),_display_(/*270.81*/routes/*270.87*/.Application.project()),format.raw/*270.109*/(""""><i class="fa fa-line-chart fa-fw"></i> Projects"""),_display_(/*270.159*/if(PersonData.findActiveProjects().size()>0)/*270.203*/{_display_(Seq[Any](format.raw/*270.204*/("""<span class="fa arrow"></span>""")))}),format.raw/*270.235*/("""</a>
                    """),_display_(/*271.22*/defining(PersonData.findActiveProjects())/*271.63*/ { projects =>_display_(Seq[Any](format.raw/*271.77*/("""
                        """),_display_(/*272.26*/if(projects.size() > 0)/*272.49*/ {_display_(Seq[Any](format.raw/*272.51*/("""
                            """),format.raw/*273.29*/("""<ul class="nav nav-second-level">
                                """),_display_(/*274.34*/for(p <- projects) yield /*274.52*/{_display_(Seq[Any](format.raw/*274.53*/("""
                                    """),_display_(/*275.38*/defining(Role.find.where().eq("person", currentUser).eq("project", p).findUnique().role)/*275.126*/ { role =>_display_(Seq[Any](format.raw/*275.136*/("""
                                        """),_display_(/*276.42*/if(role.equals(Role.OWNER))/*276.69*/ {_display_(Seq[Any](format.raw/*276.71*/("""
                                            """),format.raw/*277.45*/("""<li>
                                                <a href=""""),_display_(/*278.59*/routes/*278.65*/.ProjectData.project(p.id)),format.raw/*278.91*/(""""><i class="fa fa-mortar-board"></i> """),_display_(/*278.129*/p/*278.130*/.folder),format.raw/*278.137*/("""</a>
                                            </li>
                                        """)))}/*280.43*/else/*280.48*/{_display_(Seq[Any](format.raw/*280.49*/("""
                                            """),_display_(/*281.46*/if(role.equals(Role.REVIEWER))/*281.76*/{_display_(Seq[Any](format.raw/*281.77*/("""
                                                """),format.raw/*282.49*/("""<li>
                                                    <a href=""""),_display_(/*283.63*/routes/*283.69*/.ProjectData.project(p.id)),format.raw/*283.95*/(""""><i class="fa fa-edit"></i> """),_display_(/*283.125*/p/*283.126*/.folder),format.raw/*283.133*/("""</a>
                                                </li>
                                            """)))}/*285.47*/else/*285.52*/{_display_(Seq[Any](format.raw/*285.53*/("""
                                                """),_display_(/*286.50*/if(role.equals(Role.GUEST))/*286.77*/{_display_(Seq[Any](format.raw/*286.78*/("""
                                                    """),format.raw/*287.53*/("""<li>
                                                        <a href=""""),_display_(/*288.67*/routes/*288.73*/.ProjectData.project(p.id)),format.raw/*288.99*/(""""><i class="fa fa-suitcase"></i> """),_display_(/*288.133*/p/*288.134*/.folder),format.raw/*288.141*/("""</a>
                                                    </li>
                                                """)))}),format.raw/*290.50*/("""
                                            """)))}),format.raw/*291.46*/("""
                                        """)))}),format.raw/*292.42*/("""
                                    """)))}),format.raw/*293.38*/("""
                                """)))}),format.raw/*294.34*/("""
                            """),format.raw/*295.29*/("""</ul>
                        """)))}),format.raw/*296.26*/("""
                    """)))}),format.raw/*297.22*/("""
                    """),format.raw/*298.21*/("""<!-- /.nav-second-level -->
                </li>
                <li>
                    <a """),_display_(/*301.25*/if(parentpage.equals("calendar"))/*301.58*/{_display_(Seq[Any](format.raw/*301.59*/("""class="active"""")))}),format.raw/*301.74*/(""" """),format.raw/*301.75*/("""href=""""),_display_(/*301.82*/routes/*301.88*/.CalendarData.calendar()),format.raw/*301.112*/(""""><i class="fa fa-calendar fa-fw"></i> Calendar</a>
                </li>
                <li>
                    <a """),_display_(/*304.25*/if(parentpage.equals("discussion"))/*304.60*/{_display_(Seq[Any](format.raw/*304.61*/("""class="active"""")))}),format.raw/*304.76*/(""" """),format.raw/*304.77*/("""href=""""),_display_(/*304.84*/routes/*304.90*/.Application.discussion()),format.raw/*304.115*/(""""><i class="fa fa-comments fa-fw"></i> Discussions"""),_display_(/*304.166*/if(PersonData.findActiveProjects().size()>0)/*304.210*/{_display_(Seq[Any](format.raw/*304.211*/("""<span class="fa arrow"></span>""")))}),format.raw/*304.242*/("""</a>
                    """),_display_(/*305.22*/defining(PersonData.findActiveProjects())/*305.63*/ { projects =>_display_(Seq[Any](format.raw/*305.77*/("""
                        """),_display_(/*306.26*/if(projects.size() > 0)/*306.49*/ {_display_(Seq[Any](format.raw/*306.51*/("""
                            """),format.raw/*307.29*/("""<ul class="nav nav-second-level">
                            """),_display_(/*308.30*/for(p <- projects) yield /*308.48*/{_display_(Seq[Any](format.raw/*308.49*/("""
                                """),_display_(/*309.34*/defining(Role.find.where().eq("person", currentUser).eq("project", p).findUnique().role)/*309.122*/ { role =>_display_(Seq[Any](format.raw/*309.132*/("""
                                    """),_display_(/*310.38*/if(role.equals(Role.OWNER))/*310.65*/ {_display_(Seq[Any](format.raw/*310.67*/("""
                                        """),format.raw/*311.41*/("""<li>
                                            <a href=""""),_display_(/*312.55*/routes/*312.61*/.DiscussionData.discussion(p.id)),format.raw/*312.93*/(""""><i class="fa fa-mortar-board"></i> """),_display_(/*312.131*/p/*312.132*/.folder),format.raw/*312.139*/("""</a>
                                        </li>
                                    """)))}/*314.39*/else/*314.44*/{_display_(Seq[Any](format.raw/*314.45*/("""
                                        """),_display_(/*315.42*/if(role.equals(Role.REVIEWER))/*315.72*/{_display_(Seq[Any](format.raw/*315.73*/("""
                                            """),format.raw/*316.45*/("""<li>
                                                <a href=""""),_display_(/*317.59*/routes/*317.65*/.DiscussionData.discussion(p.id)),format.raw/*317.97*/(""""><i class="fa fa-edit"></i> """),_display_(/*317.127*/p/*317.128*/.folder),format.raw/*317.135*/("""</a>
                                            </li>
                                        """)))}/*319.43*/else/*319.48*/{_display_(Seq[Any](format.raw/*319.49*/("""
                                            """),_display_(/*320.46*/if(role.equals(Role.GUEST))/*320.73*/{_display_(Seq[Any](format.raw/*320.74*/("""
                                                """),format.raw/*321.49*/("""<li>
                                                    <a href=""""),_display_(/*322.63*/routes/*322.69*/.DiscussionData.discussion(p.id)),format.raw/*322.101*/(""""><i class="fa fa-suitcase"></i> """),_display_(/*322.135*/p/*322.136*/.folder),format.raw/*322.143*/("""</a>
                                                </li>
                                            """)))}),format.raw/*324.46*/("""
                                        """)))}),format.raw/*325.42*/("""
                                    """)))}),format.raw/*326.38*/("""
                                """)))}),format.raw/*327.34*/("""
                            """)))}),format.raw/*328.30*/("""
                            """),format.raw/*329.29*/("""</ul>
                        """)))}),format.raw/*330.26*/("""
                    """)))}),format.raw/*331.22*/("""
                        """),format.raw/*332.25*/("""<!-- /.nav-second-level -->
                </li>
                <li>
                    <a """),_display_(/*335.25*/if(parentpage.equals("task"))/*335.54*/{_display_(Seq[Any](format.raw/*335.55*/("""class="active"""")))}),format.raw/*335.70*/(""" """),format.raw/*335.71*/("""href=""""),_display_(/*335.78*/routes/*335.84*/.Application.task()),format.raw/*335.103*/(""""><i class="fa fa-wrench fa-fw"></i> Tasks</a>

                    <!-- /.nav-second-level -->
                </li>
                <li>
                    <a """),_display_(/*340.25*/if(parentpage.equals("suggestion"))/*340.60*/{_display_(Seq[Any](format.raw/*340.61*/("""class="active"""")))}),format.raw/*340.76*/(""" """),format.raw/*340.77*/("""href=""""),_display_(/*340.84*/routes/*340.90*/.Application.suggestions()),format.raw/*340.116*/(""""><i class="fa fa-lightbulb-o fa-fw"></i> Suggestions & Tips</a>

                    <!-- /.nav-second-level -->
                </li>
                
            </ul>
            """),format.raw/*346.54*/("""
                    """),format.raw/*347.21*/("""<!-- TAG CLOUD -->
                """),format.raw/*348.50*/("""
                    """),format.raw/*349.75*/("""
                        """),format.raw/*350.128*/("""
                        """),format.raw/*351.35*/("""
                    """),format.raw/*352.31*/("""
                """),format.raw/*353.27*/("""
            """),format.raw/*354.18*/("""
        """),format.raw/*355.9*/("""</div>
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
                  DATE: Tue Feb 17 22:25:14 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/dashboard.scala.html
                  HASH: 20cedd32070e9f0d6f5429bbee8d223794f62706
                  MATRIX: 734->1|862->41|889->42|10288->9413|10309->9424|10336->9429|10366->9430|10781->9817|10797->9823|10846->9850|11263->10238|11293->10239|11335->10252|11804->10692|11834->10693|12154->11019|12212->11097|12274->11167|12337->11289|12399->11363|12465->11431|12535->11524|12601->11576|12663->11620|12725->11663|12783->11702|12837->11737|12903->11774|13016->11859|13060->11893|13100->11894|13147->11909|13177->11910|13212->11917|13228->11923|13271->11943|13421->12065|13463->12097|13503->12098|13550->12113|13580->12114|13615->12121|13631->12127|13676->12149|13755->12199|13810->12243|13851->12244|13915->12275|13969->12301|14020->12342|14073->12356|14127->12382|14160->12405|14201->12407|14259->12436|14354->12503|14389->12521|14429->12522|14495->12560|14594->12648|14644->12658|14714->12700|14751->12727|14792->12729|14866->12774|14957->12837|14973->12843|15021->12869|15088->12907|15100->12908|15130->12915|15246->13012|15260->13017|15300->13018|15374->13064|15414->13094|15454->13095|15532->13144|15627->13211|15643->13217|15691->13243|15750->13273|15762->13274|15792->13281|15916->13386|15930->13391|15970->13392|16048->13442|16085->13469|16125->13470|16207->13523|16306->13594|16322->13600|16370->13626|16433->13660|16445->13661|16475->13668|16619->13780|16697->13826|16771->13868|16841->13906|16907->13940|16965->13969|17028->14000|17082->14022|17132->14043|17255->14138|17298->14171|17338->14172|17385->14187|17415->14188|17450->14195|17466->14201|17513->14225|17660->14344|17705->14379|17745->14380|17792->14395|17822->14396|17857->14403|17873->14409|17921->14434|18001->14485|18056->14529|18097->14530|18161->14561|18215->14587|18266->14628|18319->14642|18373->14668|18406->14691|18447->14693|18505->14722|18596->14785|18631->14803|18671->14804|18733->14838|18832->14926|18882->14936|18948->14974|18985->15001|19026->15003|19096->15044|19183->15103|19199->15109|19253->15141|19320->15179|19332->15180|19362->15187|19470->15276|19484->15281|19524->15282|19594->15324|19634->15354|19674->15355|19748->15400|19839->15463|19855->15469|19909->15501|19968->15531|19980->15532|20010->15539|20126->15636|20140->15641|20180->15642|20254->15688|20291->15715|20331->15716|20409->15765|20504->15832|20520->15838|20575->15870|20638->15904|20650->15905|20680->15912|20816->16016|20890->16058|20960->16096|21026->16130|21088->16160|21146->16189|21209->16220|21263->16242|21317->16267|21440->16362|21479->16391|21519->16392|21566->16407|21596->16408|21631->16415|21647->16421|21689->16440|21880->16603|21925->16638|21965->16639|22012->16654|22042->16655|22077->16662|22093->16668|22142->16694|22354->16918|22404->16939|22468->17007|22518->17082|22573->17210|22627->17245|22677->17276|22723->17303|22765->17321|22802->17330
                  LINES: 26->1|29->1|30->2|241->213|241->213|241->213|241->213|249->221|249->221|249->221|262->234|262->234|263->235|271->243|271->243|278->250|279->251|280->252|281->253|282->254|283->255|284->256|285->257|286->258|287->259|288->260|289->261|291->263|295->267|295->267|295->267|295->267|295->267|295->267|295->267|295->267|298->270|298->270|298->270|298->270|298->270|298->270|298->270|298->270|298->270|298->270|298->270|298->270|299->271|299->271|299->271|300->272|300->272|300->272|301->273|302->274|302->274|302->274|303->275|303->275|303->275|304->276|304->276|304->276|305->277|306->278|306->278|306->278|306->278|306->278|306->278|308->280|308->280|308->280|309->281|309->281|309->281|310->282|311->283|311->283|311->283|311->283|311->283|311->283|313->285|313->285|313->285|314->286|314->286|314->286|315->287|316->288|316->288|316->288|316->288|316->288|316->288|318->290|319->291|320->292|321->293|322->294|323->295|324->296|325->297|326->298|329->301|329->301|329->301|329->301|329->301|329->301|329->301|329->301|332->304|332->304|332->304|332->304|332->304|332->304|332->304|332->304|332->304|332->304|332->304|332->304|333->305|333->305|333->305|334->306|334->306|334->306|335->307|336->308|336->308|336->308|337->309|337->309|337->309|338->310|338->310|338->310|339->311|340->312|340->312|340->312|340->312|340->312|340->312|342->314|342->314|342->314|343->315|343->315|343->315|344->316|345->317|345->317|345->317|345->317|345->317|345->317|347->319|347->319|347->319|348->320|348->320|348->320|349->321|350->322|350->322|350->322|350->322|350->322|350->322|352->324|353->325|354->326|355->327|356->328|357->329|358->330|359->331|360->332|363->335|363->335|363->335|363->335|363->335|363->335|363->335|363->335|368->340|368->340|368->340|368->340|368->340|368->340|368->340|368->340|374->346|375->347|376->348|377->349|378->350|379->351|380->352|381->353|382->354|383->355
                  -- GENERATED --
              */
          