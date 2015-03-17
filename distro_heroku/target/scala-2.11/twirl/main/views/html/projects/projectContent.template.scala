
package views.html.projects

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
object projectContent extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Person,Project,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(currentUser: Person, project: Project):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.41*/("""
"""),_display_(/*2.2*/defining(PersonData.findActiveProjects)/*2.41*/ { activeProjectList =>_display_(Seq[Any](format.raw/*2.64*/("""
    """),format.raw/*3.5*/("""<div class="tab-content">
        """),_display_(/*4.10*/for(p <- activeProjectList) yield /*4.37*/{_display_(Seq[Any](format.raw/*4.38*/("""
            """),_display_(/*5.14*/if(project != null)/*5.33*/{_display_(Seq[Any](format.raw/*5.34*/("""
                """),_display_(/*6.18*/if(p.id == project.id)/*6.40*/ {_display_(Seq[Any](format.raw/*6.42*/("""
                    """),format.raw/*7.21*/("""<div class="tab-pane fade in active" id="project"""),_display_(/*7.70*/p/*7.71*/.id),format.raw/*7.74*/("""">
                 """)))}/*8.20*/else/*8.25*/{_display_(Seq[Any](format.raw/*8.26*/("""
                    """),format.raw/*9.21*/("""<div class="tab-pane fade" id="project"""),_display_(/*9.60*/p/*9.61*/.id),format.raw/*9.64*/("""">
                 """)))}),format.raw/*10.19*/("""
            """)))}/*11.15*/else/*11.20*/{_display_(Seq[Any](format.raw/*11.21*/("""
                """),_display_(/*12.18*/if(p.equals(PersonData.getLastUsedProject))/*12.61*/{_display_(Seq[Any](format.raw/*12.62*/("""
                    """),format.raw/*13.21*/("""<div class="tab-pane fade in active" id="project"""),_display_(/*13.70*/p/*13.71*/.id),format.raw/*13.74*/("""">
                """)))}/*14.19*/else/*14.24*/{_display_(Seq[Any](format.raw/*14.25*/("""
                    """),format.raw/*15.21*/("""<div class="tab-pane fade" id="project"""),_display_(/*15.60*/p/*15.61*/.id),format.raw/*15.64*/("""">
                """)))}),format.raw/*16.18*/("""
            """)))}),format.raw/*17.14*/("""
            """),_display_(/*18.14*/defining(Role.find.where().eq("project", p).eq("person", currentUser).findUnique())/*18.97*/{ role =>_display_(Seq[Any](format.raw/*18.106*/("""
            """),format.raw/*19.13*/("""<div class="container-fluid" style="margin-top: 10px">
                <div class="row">
                    <div class="panel panel-info">
                            <div class="panel-body">
                                <div class="row">
                                    <div class="col-xs-10">
                                        <p style="font-size: 15pt;"><b>"""),_display_(/*25.73*/p/*25.74*/.name),format.raw/*25.79*/("""</b></p>
                                        <p><i>"""),_display_(/*26.48*/p/*26.49*/.description),format.raw/*26.61*/("""</i><p>
                                        """),format.raw/*27.109*/("""
                                        """),format.raw/*28.41*/("""<p>
                                            """),_display_(/*29.46*/if((!p.template.equals("None")) && (p.active.equals(true)))/*29.105*/ {_display_(Seq[Any](format.raw/*29.107*/("""
                                                """),format.raw/*30.49*/("""<i>download """),_display_(/*30.62*/p/*30.63*/.template),format.raw/*30.72*/(""" """),format.raw/*30.73*/("""from here</i>
                                                """),_display_(/*31.50*/if(p.template.equals("Own"))/*31.78*/ {_display_(Seq[Any](format.raw/*31.80*/("""
                                                    """),format.raw/*32.53*/("""<a href=""""),_display_(/*32.63*/{
                                                        routes.DocumentData.downloadOwnTemplate(p.id)
                                                    }),format.raw/*34.54*/("""" title="Download the """),_display_(/*34.77*/p/*34.78*/.template),format.raw/*34.87*/(""" """),format.raw/*34.88*/("""template">
                                                        <i class="fa fa-cloud-download fa-fw"></i>
                                                    </a>
                                                """)))}/*37.51*/else/*37.56*/{_display_(Seq[Any](format.raw/*37.57*/("""
                                                    """),format.raw/*38.53*/("""<a href=""""),_display_(/*38.63*/{
                                                        routes.DocumentData.downloadTemplate()
                                                    }),format.raw/*40.54*/("""" title="Download the """),_display_(/*40.77*/p/*40.78*/.template),format.raw/*40.87*/(""" """),format.raw/*40.88*/("""template">
                                                        <i class="fa fa-cloud-download fa-fw"></i>
                                                    </a>
                                                """)))}),format.raw/*43.50*/("""
                                            """)))}),format.raw/*44.46*/("""
                                            """),_display_(/*45.46*/if(p.template.equals("None") && p.active.equals(true))/*45.100*/{_display_(Seq[Any](format.raw/*45.101*/("""
                                                """),_display_(/*46.50*/projects/*46.58*/.owntemplate(p)),format.raw/*46.73*/("""
                                            """)))}),format.raw/*47.46*/("""
                                            """),_display_(/*48.46*/if(p.template.equals("Own") && p.planning.equals(false))/*48.102*/{_display_(Seq[Any](format.raw/*48.103*/("""
                                                """),_display_(/*49.50*/projects/*49.58*/.ownplanning(currentUser,p)),format.raw/*49.85*/("""
                                            """)))}),format.raw/*50.46*/("""
                                        """),format.raw/*51.41*/("""<p>
                                    </div>
                                    <div class="col-xs-2">
                                        <ul class="nav navbar-top-links navbar-right" style="text-align: right">
                                            <li class="dropdown" style="height: 20px">
                                                <a class="dropdown-toggle" data-toggle="dropdown" href="#" style="margin: 0; padding: 0">
                                                    <i class="fa fa-cog fa-fw"></i><span class="caret"></span>
                                                </a>
                                                <ul class="dropdown-menu dropdown-menu-right dropdown-messages" style="width: 200px">
                                                    """),_display_(/*60.54*/if(role.role.equals(Role.OWNER))/*60.86*/ {_display_(Seq[Any](format.raw/*60.88*/("""
                                                        """),format.raw/*61.57*/("""<li><a href=""""),_display_(/*61.71*/routes/*61.77*/.ProjectData.editProjectPage(p.id)),format.raw/*61.111*/(""""><i class="fa fa-pencil fa-fw"></i>
                                                            Edit project details...</a></li>
                                                    """)))}),format.raw/*63.54*/("""
                                                    """),format.raw/*64.53*/("""<li><a href=""""),_display_(/*64.67*/routes/*64.73*/.DiscussionData.discussion(p.id)),format.raw/*64.105*/(""""><i class="fa fa-comments fa-fw"></i> Go to discussions...</a></li>
                                                    <li class="divider"></li>
                                                    <li><a href="#" data-toggle="modal" data-target="#memberList"""),_display_(/*66.114*/p/*66.115*/.id),format.raw/*66.118*/(""""><i class="fa fa-users fa-fw"></i> Show members...</a></li>
                                                    """),_display_(/*67.54*/if(role.role.equals(Role.OWNER))/*67.86*/{_display_(Seq[Any](format.raw/*67.87*/("""
                                                        """),format.raw/*68.57*/("""<li><a href="#" data-toggle="modal" data-target="#addMemberToProject"""),_display_(/*68.126*/p/*68.127*/.id),format.raw/*68.130*/(""""><i class="fa fa-user-plus fa-fw"></i> Add a member...</a></li>
                                                    """)))}),format.raw/*69.54*/("""
                                                    """),format.raw/*70.53*/("""<li class="divider"></li>
                                                    """),_display_(/*71.54*/if(!(ProjectData.findAllOwners(p.id).contains(currentUser) && ProjectData.findAllOwners(p.id).size() == 1))/*71.161*/ {_display_(Seq[Any](format.raw/*71.163*/("""
                                                        """),format.raw/*72.57*/("""<li><a href="#" data-toggle="modal" data-target="#leaveProject"""),_display_(/*72.120*/p/*72.121*/.id),format.raw/*72.124*/(""""><i class="fa fa-sign-out fa-fw"></i>
                                                            Leave project</a></li>
                                                    """)))}/*74.55*/else/*74.60*/{_display_(Seq[Any](format.raw/*74.61*/("""
                                                        """),format.raw/*75.57*/("""<li><a href="#" data-toggle="modal" data-target="#archiveProject"""),_display_(/*75.122*/p/*75.123*/.id),format.raw/*75.126*/(""""><i class="fa fa-archive fa-fw"></i> Archive Project</a></li>
                                                    """)))}),format.raw/*76.54*/("""
                                                """),format.raw/*77.49*/("""</ul>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                                <hr class="hr" style="margin-top: 0">
                                    """),_display_(/*83.38*/projects/*83.46*/.projectFileList(currentUser, project)),format.raw/*83.84*/("""
                                    """),_display_(/*84.38*/projects/*84.46*/.projectUploadButtons(p)),format.raw/*84.70*/("""
                            """),format.raw/*85.29*/("""</div>
                    </div>
                </div>
            </div>
        </div>
            """),format.raw/*90.35*/("""
            """),_display_(/*91.14*/template/*91.22*/.smallmodal("editProject"+p.id.toString)/*91.62*/("info")/*91.70*/("Edit details of "+p.name)/*91.97*/ {_display_(Seq[Any](format.raw/*91.99*/("""
                """),_display_(/*92.18*/helper/*92.24*/.form(action = routes.ProjectData.editProject(p.id))/*92.76*/ {_display_(Seq[Any](format.raw/*92.78*/("""
                    """),format.raw/*93.21*/("""<div class="form-group">
                        <label for="validate-text">Folder Name</label>
                        <div class="input-group" data-validate="length" data-length="3">
                            <input type="text" class="form-control" name="folder" value=""""),_display_(/*96.91*/p/*96.92*/.folder),format.raw/*96.99*/("""" id="validate-text" placeholder="Required" required>
                            <span class="input-group-addon danger"><span class="glyphicon glyphicon-remove"></span></span>
                        </div>
                        <span class="help-inline" style="font-size: x-small;">Minimum length: 3</span>
                    </div>
                    <div class="form-group">
                        <label for="validate-text">Project Name</label>
                        <div class="input-group" data-validate="length" data-length="3">
                            <input type="text" class="form-control" name="name" value=""""),_display_(/*104.89*/p/*104.90*/.name),format.raw/*104.95*/("""" id="validate-text" placeholder="Required" required>
                            <span class="input-group-addon danger"><span class="glyphicon glyphicon-remove"></span></span>
                        </div>
                        <span class="help-inline" style="font-size: x-small;">Minimum length: 3</span>
                    </div>
                    <div class="form-group">
                        <label for="validate-optional">Description</label>
                        <div class="input-group">
                            <input type="text" class="form-control" name="description" value=""""),_display_(/*112.96*/p/*112.97*/.description),format.raw/*112.109*/("""" id="validate-optional" placeholder="Optional">
                            <span class="input-group-addon info"><span class="glyphicon glyphicon-asterisk"></span></span>
                        </div>
                    </div>
                    <label>Chosen template: </label>
                    <p>"""),_display_(/*117.25*/p/*117.26*/.template),format.raw/*117.35*/("""</p>
                    <div class="btn-group col-xs-6" role="group" style="margin:20px 0px 0px 0px">
                        <button type="submit" class="btn btn-info col-xs-12" disabled>Edit!</button>
                    </div>
                    <div class="btn-group col-xs-6" role="group" style="margin:20px 0px 0px 0px">
                        <button type="button" class="btn btn-default col-xs-12" data-dismiss="modal">Cancel</button>
                    </div>
                """)))}),format.raw/*124.18*/("""
            """)))}),format.raw/*125.14*/("""
            """),format.raw/*126.51*/("""
            """),_display_(/*127.14*/template/*127.22*/.smallmodal("archiveProject"+p.id.toString)/*127.65*/("danger")/*127.75*/("Request to archive "+p.name)/*127.105*/ {_display_(Seq[Any](format.raw/*127.107*/("""
                """),format.raw/*128.17*/("""<p>Are you sure you want to archive project """),_display_(/*128.62*/p/*128.63*/.name),format.raw/*128.68*/(""", and all of its files?</p>
                <div class="btn-group col-xs-6" role="group" style="margin:20px 0px 0px 0px">
                    <a type="button" class="btn btn-default col-xs-12" data-dismiss="modal">Cancel</a>
                </div>
                <div class="btn-group col-xs-6" role="group" style="margin:20px 0px 0px 0px">
                    <a class="btn btn-danger col-xs-12" href=""""),_display_(/*133.64*/routes/*133.70*/.ProjectData.archiveProject(p.id)),format.raw/*133.103*/("""">Archive!</a>
                </div>
            """)))}),format.raw/*135.14*/("""
            """),format.raw/*136.49*/("""
            """),_display_(/*137.14*/template/*137.22*/.smallmodal("leaveProject"+p.id.toString)/*137.63*/("danger")/*137.73*/("Leaving "+p.name)/*137.92*/ {_display_(Seq[Any](format.raw/*137.94*/("""
                """),format.raw/*138.17*/("""<p style="text-align: center">Are you sure you want to leave project """),_display_(/*138.87*/p/*138.88*/.name),format.raw/*138.93*/("""?</p>
                <div class="btn-group col-xs-6" role="group" style="margin:20px 0px 0px 0px">
                    <a type="button" class="btn btn-default col-xs-12" data-dismiss="modal">Cancel</a>
                </div>
                <div class="btn-group col-xs-6" role="group" style="margin:20px 0px 0px 0px">
                    <a class="btn btn-danger col-xs-12" href=""""),_display_(/*143.64*/routes/*143.70*/.ProjectData.leaveProject(p.id)),format.raw/*143.101*/("""">Leave!</a>
                </div>
            """)))}),format.raw/*145.14*/("""
            """),format.raw/*146.33*/("""
            """),_display_(/*147.14*/template/*147.22*/.smallmodal("addMemberToProject"+p.id.toString)/*147.69*/("info")/*147.77*/("Add a Member to "+p.name)/*147.104*/ {_display_(Seq[Any](format.raw/*147.106*/("""
                """),_display_(/*148.18*/helper/*148.24*/.form(action = routes.ProjectData.inviteMemberToProjectAs(p.id))/*148.88*/ {_display_(Seq[Any](format.raw/*148.90*/("""
                    """),format.raw/*149.21*/("""<div class="form-group">
                        <label class="control-label" for="email">Email</label>
                        <input autofocus class="form-control input-sm" id="email" name="email" type="email" placeholder="Email">
                        <br>
                        <label>Add this person as a: </label>
                        <select class="form-control" name="role">
                            <option>Owner</option>
                            <option>Reviewer</option>
                            <option>Guest</option>
                        </select>
                    </div>
                    <div class="btn-group col-xs-6" role="group" style="margin:20px 0px 0px 0px">
                        <button type="button" class="btn btn-default col-xs-12" data-dismiss="modal">Cancel</button>
                    </div>
                    <div class="btn-group col-xs-6" role="group" style="margin:20px 0px 0px 0px">
                        <button type="submit" class="btn btn-info col-xs-12">Invite!</button>
                    </div>
                """)))}),format.raw/*166.18*/("""
            """)))}),format.raw/*167.14*/("""
            """),_display_(/*168.14*/template/*168.22*/.mediummodal("memberList"+p.id.toString)/*168.62*/("info")/*168.70*/("Members of "+p.name)/*168.92*/ {_display_(Seq[Any](format.raw/*168.94*/("""
                        """),format.raw/*169.25*/("""<!-- Table -->
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Name</th>
                                <th style="text-align: center">Role</th>
                                <th style="text-align: center">Status</th>
                                <th style="text-align: center">Date</th>
                                """),_display_(/*177.34*/if(role.role.equals(Role.OWNER))/*177.66*/{_display_(Seq[Any](format.raw/*177.67*/("""
                                    """),format.raw/*178.37*/("""<th style="text-align: center"> </th>
                                """)))}),format.raw/*179.34*/("""
                            """),format.raw/*180.29*/("""</tr>
                        </thead>
                        <tbody>
                            """),_display_(/*183.30*/ProjectData/*183.41*/.findAllAffiliatedUsers(p.id).map/*183.74*/ { user =>_display_(Seq[Any](format.raw/*183.84*/("""
                                """),_display_(/*184.34*/defining(Role.find.where().eq("project",p).eq("person",user).findUnique())/*184.108*/{ userrole =>_display_(Seq[Any](format.raw/*184.121*/("""
                                    """),format.raw/*185.37*/("""<tr style="font-size: smaller">
                                        <td>"""),_display_(/*186.46*/user/*186.50*/.name),format.raw/*186.55*/("""<br>"""),_display_(/*186.60*/user/*186.64*/.email),format.raw/*186.70*/("""</td>
                                        <td style="text-align: center">"""),_display_(/*187.73*/userrole/*187.81*/.role),format.raw/*187.86*/("""</td>
                                        <td style="text-align: center"> """),_display_(/*188.74*/if(userrole.accepted)/*188.95*/{_display_(Seq[Any](format.raw/*188.96*/("""Joined""")))}/*188.104*/else/*188.109*/{_display_(Seq[Any](format.raw/*188.110*/("""Invited""")))}),format.raw/*188.118*/("""</td>
                                        <td style="text-align: center">
                                            """),_display_(/*190.46*/if(userrole.accepted)/*190.67*/{_display_(Seq[Any](format.raw/*190.68*/("""
                                                """),_display_(/*191.50*/userrole/*191.58*/.dateJoined.toString.substring(0,10)),format.raw/*191.94*/("""
                                            """)))}/*192.47*/else/*192.52*/{_display_(Seq[Any](format.raw/*192.53*/("""
                                                """),_display_(/*193.50*/userrole/*193.58*/.dateInvited.toString.substring(0,10)),format.raw/*193.95*/("""
                                            """)))}),format.raw/*194.46*/("""
                                        """),format.raw/*195.41*/("""</td>
                                        """),_display_(/*196.42*/if(role.role.equals(Role.OWNER) && !currentUser.equals(user) && !userrole.role.equals(Role.OWNER))/*196.140*/{_display_(Seq[Any](format.raw/*196.141*/("""
                                            """),format.raw/*197.45*/("""<td style="text-align: center">
                                                <a href=""""),_display_(/*198.59*/routes/*198.65*/.ProjectData.removeMemberFromProject(user.id, p.id)),format.raw/*198.116*/("""" style="color: red; font-size: larger"><i class="fa fa-close"></i></a>
                                            </td>
                                        """)))}),format.raw/*200.42*/("""
                                    """),format.raw/*201.37*/("""</tr>
                                """)))}),format.raw/*202.34*/("""
                            """)))}),format.raw/*203.30*/("""
                        """),format.raw/*204.25*/("""</tbody>
                    </table>
                """)))}),format.raw/*206.18*/("""
            """)))}),format.raw/*207.14*/("""

        """)))}),format.raw/*209.10*/("""
    """),format.raw/*210.5*/("""</div>
""")))}),format.raw/*211.2*/("""
"""))}
  }

  def render(currentUser:Person,project:Project): play.twirl.api.HtmlFormat.Appendable = apply(currentUser,project)

  def f:((Person,Project) => play.twirl.api.HtmlFormat.Appendable) = (currentUser,project) => apply(currentUser,project)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Feb 17 22:25:16 CET 2015
                  SOURCE: /Users/soheil/Documents/git/asistu/app/views/projects/projectContent.scala.html
                  HASH: 00b509048525d23fae8991913f6f259359514a66
                  MATRIX: 749->1|876->40|903->42|950->81|1010->104|1041->109|1102->144|1144->171|1182->172|1222->186|1249->205|1287->206|1331->224|1361->246|1400->248|1448->269|1523->318|1532->319|1555->322|1594->344|1606->349|1644->350|1692->371|1757->410|1766->411|1789->414|1841->435|1874->450|1887->455|1926->456|1971->474|2023->517|2062->518|2111->539|2187->588|2197->589|2221->592|2260->613|2273->618|2312->619|2361->640|2427->679|2437->680|2461->683|2512->703|2557->717|2598->731|2690->814|2738->823|2779->836|3181->1211|3191->1212|3217->1217|3300->1273|3310->1274|3343->1286|3420->1402|3489->1443|3565->1492|3634->1551|3675->1553|3752->1602|3792->1615|3802->1616|3832->1625|3861->1626|3951->1689|3988->1717|4028->1719|4109->1772|4146->1782|4324->1939|4374->1962|4384->1963|4414->1972|4443->1973|4678->2190|4691->2195|4730->2196|4811->2249|4848->2259|5019->2409|5069->2432|5079->2433|5109->2442|5138->2443|5385->2659|5462->2705|5535->2751|5599->2805|5639->2806|5716->2856|5733->2864|5769->2879|5846->2925|5919->2971|5985->3027|6025->3028|6102->3078|6119->3086|6167->3113|6244->3159|6313->3200|7135->3995|7176->4027|7216->4029|7301->4086|7342->4100|7357->4106|7413->4140|7627->4323|7708->4376|7749->4390|7764->4396|7818->4428|8106->4688|8117->4689|8142->4692|8283->4806|8324->4838|8363->4839|8448->4896|8545->4965|8556->4966|8581->4969|8730->5087|8811->5140|8917->5219|9034->5326|9075->5328|9160->5385|9251->5448|9262->5449|9287->5452|9481->5628|9494->5633|9533->5634|9618->5691|9711->5756|9722->5757|9747->5760|9894->5876|9971->5925|10289->6216|10306->6224|10365->6262|10430->6300|10447->6308|10492->6332|10549->6361|10680->6486|10721->6500|10738->6508|10787->6548|10804->6556|10840->6583|10880->6585|10925->6603|10940->6609|11001->6661|11041->6663|11090->6684|11392->6959|11402->6960|11430->6967|12090->7599|12101->7600|12128->7605|12759->8208|12770->8209|12805->8221|13140->8528|13151->8529|13182->8538|13704->9028|13750->9042|13792->9093|13834->9107|13852->9115|13905->9158|13925->9168|13966->9198|14008->9200|14054->9217|14127->9262|14138->9263|14165->9268|14598->9673|14614->9679|14670->9712|14753->9763|14795->9812|14837->9826|14855->9834|14906->9875|14926->9885|14955->9904|14996->9906|15042->9923|15140->9993|15151->9994|15178->9999|15589->10382|15605->10388|15659->10419|15740->10468|15782->10501|15824->10515|15842->10523|15899->10570|15917->10578|15955->10605|15997->10607|16043->10625|16059->10631|16133->10695|16174->10697|16224->10718|17341->11803|17387->11817|17429->11831|17447->11839|17497->11879|17515->11887|17547->11909|17588->11911|17642->11936|18104->12370|18146->12402|18186->12403|18252->12440|18355->12511|18413->12540|18541->12640|18562->12651|18605->12684|18654->12694|18716->12728|18801->12802|18854->12815|18920->12852|19025->12929|19039->12933|19066->12938|19099->12943|19113->12947|19141->12953|19247->13031|19265->13039|19292->13044|19399->13123|19430->13144|19470->13145|19498->13153|19513->13158|19554->13159|19595->13167|19746->13290|19777->13311|19817->13312|19895->13362|19913->13370|19971->13406|20037->13453|20051->13458|20091->13459|20169->13509|20187->13517|20246->13554|20324->13600|20394->13641|20469->13688|20578->13786|20619->13787|20693->13832|20811->13922|20827->13928|20901->13979|21096->14142|21162->14179|21233->14218|21295->14248|21349->14273|21436->14328|21482->14342|21525->14353|21558->14358|21597->14366
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|37->9|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|43->15|44->16|45->17|46->18|46->18|46->18|47->19|53->25|53->25|53->25|54->26|54->26|54->26|55->27|56->28|57->29|57->29|57->29|58->30|58->30|58->30|58->30|58->30|59->31|59->31|59->31|60->32|60->32|62->34|62->34|62->34|62->34|62->34|65->37|65->37|65->37|66->38|66->38|68->40|68->40|68->40|68->40|68->40|71->43|72->44|73->45|73->45|73->45|74->46|74->46|74->46|75->47|76->48|76->48|76->48|77->49|77->49|77->49|78->50|79->51|88->60|88->60|88->60|89->61|89->61|89->61|89->61|91->63|92->64|92->64|92->64|92->64|94->66|94->66|94->66|95->67|95->67|95->67|96->68|96->68|96->68|96->68|97->69|98->70|99->71|99->71|99->71|100->72|100->72|100->72|100->72|102->74|102->74|102->74|103->75|103->75|103->75|103->75|104->76|105->77|111->83|111->83|111->83|112->84|112->84|112->84|113->85|118->90|119->91|119->91|119->91|119->91|119->91|119->91|120->92|120->92|120->92|120->92|121->93|124->96|124->96|124->96|132->104|132->104|132->104|140->112|140->112|140->112|145->117|145->117|145->117|152->124|153->125|154->126|155->127|155->127|155->127|155->127|155->127|155->127|156->128|156->128|156->128|156->128|161->133|161->133|161->133|163->135|164->136|165->137|165->137|165->137|165->137|165->137|165->137|166->138|166->138|166->138|166->138|171->143|171->143|171->143|173->145|174->146|175->147|175->147|175->147|175->147|175->147|175->147|176->148|176->148|176->148|176->148|177->149|194->166|195->167|196->168|196->168|196->168|196->168|196->168|196->168|197->169|205->177|205->177|205->177|206->178|207->179|208->180|211->183|211->183|211->183|211->183|212->184|212->184|212->184|213->185|214->186|214->186|214->186|214->186|214->186|214->186|215->187|215->187|215->187|216->188|216->188|216->188|216->188|216->188|216->188|216->188|218->190|218->190|218->190|219->191|219->191|219->191|220->192|220->192|220->192|221->193|221->193|221->193|222->194|223->195|224->196|224->196|224->196|225->197|226->198|226->198|226->198|228->200|229->201|230->202|231->203|232->204|234->206|235->207|237->209|238->210|239->211
                  -- GENERATED --
              */
          