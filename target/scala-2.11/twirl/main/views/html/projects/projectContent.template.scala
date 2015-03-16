
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
            """),format.raw/*5.13*/("""<div class="tab-pane fade """),_display_(/*5.40*/if(p.id == project.id)/*5.62*/{_display_(Seq[Any](format.raw/*5.63*/("""active in""")))}),format.raw/*5.73*/("""" id="project"""),_display_(/*5.87*/p/*5.88*/.id),format.raw/*5.91*/("""">
                """),_display_(/*6.18*/defining(Role.find.where().eq("project", p).eq("person", currentUser).eq("accepted", true).findUnique())/*6.122*/{ role =>_display_(Seq[Any](format.raw/*6.131*/("""
                    """),format.raw/*7.21*/("""<div class="container-fluid" style="margin-top: 10px">
                        <div class="row">
                            <div class="panel panel-info">
                                <div class="panel-body">
                                    <div class="row">
                                        <div class="col-xs-10">
                                            <p style="font-size: 15pt;"><b>"""),_display_(/*13.77*/p/*13.78*/.name),format.raw/*13.83*/("""</b></p>
                                            <p><i>"""),_display_(/*14.52*/p/*14.53*/.description),format.raw/*14.65*/("""</i></p>
                                            <p>
                                                """),_display_(/*16.50*/if((!p.template.equals("None")) && p.active.equals(true))/*16.107*/ {_display_(Seq[Any](format.raw/*16.109*/("""
                                                    """),format.raw/*17.53*/("""<i>download """),_display_(/*17.66*/p/*17.67*/.template),format.raw/*17.76*/(""" """),format.raw/*17.77*/("""from here</i>
                                                    """),_display_(/*18.54*/if(p.template.equals("Own"))/*18.82*/ {_display_(Seq[Any](format.raw/*18.84*/("""
                                                        """),format.raw/*19.57*/("""<a href=""""),_display_(/*19.67*/{
                                                            S3File.downloadOwnTemplate(p.id)
                                                        }),format.raw/*21.58*/("""" title="Download the """),_display_(/*21.81*/p/*21.82*/.template),format.raw/*21.91*/(""" """),format.raw/*21.92*/("""template">
                                                            <i class="fa fa-cloud-download fa-fw"></i>
                                                        </a>

                                                    """)))}/*25.55*/else/*25.60*/{_display_(Seq[Any](format.raw/*25.61*/("""
                                                        """),format.raw/*26.57*/("""<a href=""""),_display_(/*26.67*/{
                                                            S3File.downloadarticleTemplate()
                                                        }),format.raw/*28.58*/("""" title="Download the """),_display_(/*28.81*/p/*28.82*/.template),format.raw/*28.91*/(""" """),format.raw/*28.92*/("""template">
                                                            <i class="fa fa-cloud-download fa-fw"></i>
                                                        </a>
                                                    """)))}),format.raw/*31.54*/("""
                                                """)))}),format.raw/*32.50*/("""
                                                """),_display_(/*33.50*/if(p.template.equals("None") && p.active.equals(true))/*33.104*/{_display_(Seq[Any](format.raw/*33.105*/("""
                                                    """),_display_(/*34.54*/projects/*34.62*/.owntemplate(p)),format.raw/*34.77*/("""
                                                """)))}),format.raw/*35.50*/("""
                                                """),_display_(/*36.50*/if(p.template.equals("Own") && p.planning.equals(false))/*36.106*/{_display_(Seq[Any](format.raw/*36.107*/("""
                                                    """),_display_(/*37.54*/projects/*37.62*/.ownplanning(currentUser,p)),format.raw/*37.89*/("""
                                                """)))}),format.raw/*38.50*/("""
                                            """),format.raw/*39.45*/("""</p>
                                        </div>
                                        <div class="col-xs-2">
                                            <ul class="nav navbar-top-links navbar-right" style="text-align: right">
                                                <li class="dropdown" style="height: 20px">
                                                    <a class="dropdown-toggle" data-toggle="dropdown" href="#" style="margin: 0; padding: 0">
                                                        <i class="fa fa-cog fa-fw"></i><span class="caret"></span>
                                                    </a>
                                                    <ul class="dropdown-menu dropdown-menu-right dropdown-messages" style="width: 250px">
                                                        """),_display_(/*48.58*/if(role.role.equals(Role.OWNER))/*48.90*/ {_display_(Seq[Any](format.raw/*48.92*/("""
                                                            """),format.raw/*49.61*/("""<li><a href=""""),_display_(/*49.75*/routes/*49.81*/.ProjectData.editProjectPage(p.id)),format.raw/*49.115*/(""""><i class="fa fa-pencil fa-fw"></i>
                                                                Edit project details...</a></li>
                                                        """)))}),format.raw/*51.58*/("""
                                                        """),format.raw/*52.57*/("""<li><a href=""""),_display_(/*52.71*/routes/*52.77*/.DiscussionData.discussion(p.id)),format.raw/*52.109*/(""""><i class="fa fa-comments fa-fw"></i> Go to discussions...</a></li>
                                                        <li class="divider"></li>
                                                        <li><a href="#" data-toggle="modal" data-target="#memberList"""),_display_(/*54.118*/p/*54.119*/.id),format.raw/*54.122*/(""""><i class="fa fa-users fa-fw"></i> Show members...</a></li>
                                                        """),_display_(/*55.58*/if(currentUser.mendeleyConnected)/*55.91*/{_display_(Seq[Any](format.raw/*55.92*/("""
                                                            """),format.raw/*56.61*/("""<li><a href="#" data-toggle="modal" data-target="#mendeleyList"""),_display_(/*56.124*/p/*56.125*/.id),format.raw/*56.128*/(""""><img src=""""),_display_(/*56.141*/routes/*56.147*/.Assets.at("icons/mendeley-24-black.png")),format.raw/*56.188*/("""" style="margin-left: -3px; padding-right: 1px">Show Mendeley documents...</a></li>
                                                        """)))}),format.raw/*57.58*/("""

                                                        """),_display_(/*59.58*/if(role.role.equals(Role.OWNER))/*59.90*/{_display_(Seq[Any](format.raw/*59.91*/("""
                                                            """),format.raw/*60.61*/("""<li><a href="#" data-toggle="modal" data-target="#addMemberToProject"""),_display_(/*60.130*/p/*60.131*/.id),format.raw/*60.134*/(""""><i class="fa fa-user-plus fa-fw"></i> Add a member...</a></li>
                                                        """)))}),format.raw/*61.58*/("""
                                                        """),format.raw/*62.57*/("""<li class="divider"></li>
                                                        """),_display_(/*63.58*/if(!(ProjectData.findAllOwners(p.id).contains(currentUser) && ProjectData.findAllOwners(p.id).size() == 1))/*63.165*/ {_display_(Seq[Any](format.raw/*63.167*/("""
                                                            """),format.raw/*64.61*/("""<li><a href="#" data-toggle="modal" data-target="#leaveProject"""),_display_(/*64.124*/p/*64.125*/.id),format.raw/*64.128*/(""""><i class="fa fa-sign-out fa-fw"></i>
                                                                Leave project</a></li>
                                                        """)))}/*66.59*/else/*66.64*/{_display_(Seq[Any](format.raw/*66.65*/("""
                                                            """),format.raw/*67.61*/("""<li><a href="#" data-toggle="modal" data-target="#archiveProject"""),_display_(/*67.126*/p/*67.127*/.id),format.raw/*67.130*/(""""><i class="fa fa-archive fa-fw"></i> Archive Project</a></li>
                                                        """)))}),format.raw/*68.58*/("""
                                                    """),format.raw/*69.53*/("""</ul>
                                                </li>
                                            </ul>
                                                <!--End of the col-xs-2-->
                                        </div>
                                            <!--End of the row inside panel body-->
                                    </div>
                                        <!--Just horizontal line-->
                                    <hr class="hr" style="margin-top: 0">
                                        <!--Start of the project file list-->
                                    """),_display_(/*79.38*/projects/*79.46*/.projectFileList(currentUser, p)),format.raw/*79.78*/("""
                                    """),_display_(/*80.38*/if(!ProjectData.findAllGuests(p.id).contains(currentUser))/*80.96*/{_display_(Seq[Any](format.raw/*80.97*/("""
                                            """),format.raw/*81.45*/("""<!--Start of the project Upload Buttons-->
                                        """),_display_(/*82.42*/projects/*82.50*/.projectUploadButtons(p)),format.raw/*82.74*/("""
                                    """)))}),format.raw/*83.38*/("""
                                        """),format.raw/*84.41*/("""<!--End of the panel itself-->
                                </div>
                                    <!--End of the panel-info-->
                            </div>
                                <!--End of the row division-->
                        </div>
                            <!--End of the container fluid-->
                    </div>
                    """),format.raw/*92.43*/("""
                    """),_display_(/*93.22*/template/*93.30*/.smallmodal("editProject"+p.id.toString)/*93.70*/("info")/*93.78*/("Edit details of "+p.name)/*93.105*/ {_display_(Seq[Any](format.raw/*93.107*/("""
                        """),_display_(/*94.26*/helper/*94.32*/.form(action = routes.ProjectData.editProject(p.id))/*94.84*/ {_display_(Seq[Any](format.raw/*94.86*/("""
                            """),format.raw/*95.29*/("""<div class="form-group">
                                <label for="validate-text">Folder Name</label>
                                <div class="input-group" data-validate="length" data-length="3">
                                    <input type="text" class="form-control" name="folder" value=""""),_display_(/*98.99*/p/*98.100*/.folder),format.raw/*98.107*/("""" id="validate-text" placeholder="Required" required>
                                    <span class="input-group-addon danger"><span class="glyphicon glyphicon-remove"></span></span>
                                </div>
                                <span class="help-inline" style="font-size: x-small;">Minimum length: 3</span>
                            </div>
                            <div class="form-group">
                                <label for="validate-text">Project Name</label>
                                <div class="input-group" data-validate="length" data-length="3">
                                    <input type="text" class="form-control" name="name" value=""""),_display_(/*106.97*/p/*106.98*/.name),format.raw/*106.103*/("""" id="validate-text" placeholder="Required" required>
                                    <span class="input-group-addon danger"><span class="glyphicon glyphicon-remove"></span></span>
                                </div>
                                <span class="help-inline" style="font-size: x-small;">Minimum length: 3</span>
                            </div>
                            <div class="form-group">
                                <label for="validate-optional">Description</label>
                                <div class="input-group">
                                    <input type="text" class="form-control" name="description" value=""""),_display_(/*114.104*/p/*114.105*/.description),format.raw/*114.117*/("""" id="validate-optional" placeholder="Optional">
                                    <span class="input-group-addon info"><span class="glyphicon glyphicon-asterisk"></span></span>
                                </div>
                            </div>
                            <label>Chosen template: </label>
                            <p>"""),_display_(/*119.33*/p/*119.34*/.template),format.raw/*119.43*/("""</p>
                            <div class="btn-group col-xs-6" role="group" style="margin:20px 0px 0px 0px">
                                <button type="submit" class="btn btn-info col-xs-12" disabled>Edit!</button>
                            </div>
                            <div class="btn-group col-xs-6" role="group" style="margin:20px 0px 0px 0px">
                                <button type="button" class="btn btn-default col-xs-12" data-dismiss="modal">Cancel</button>
                            </div>
                        """)))}),format.raw/*126.26*/("""
                    """)))}),format.raw/*127.22*/("""
                    """),format.raw/*128.59*/("""
                    """),_display_(/*129.22*/template/*129.30*/.smallmodal("archiveProject"+p.id.toString)/*129.73*/("danger")/*129.83*/("Request to archive "+p.name)/*129.113*/ {_display_(Seq[Any](format.raw/*129.115*/("""
                        """),format.raw/*130.25*/("""<p>Are you sure you want to archive project """),_display_(/*130.70*/p/*130.71*/.name),format.raw/*130.76*/(""", and all of its files?</p>
                        <div class="btn-group col-xs-6" role="group" style="margin:20px 0px 0px 0px">
                            <a type="button" class="btn btn-default col-xs-12" data-dismiss="modal">Cancel</a>
                        </div>
                        <div class="btn-group col-xs-6" role="group" style="margin:20px 0px 0px 0px">
                            <a class="btn btn-danger col-xs-12" href=""""),_display_(/*135.72*/routes/*135.78*/.ProjectData.archiveProject(p.id)),format.raw/*135.111*/("""">Archive!</a>
                        </div>
                    """)))}),format.raw/*137.22*/("""
                    """),format.raw/*138.57*/("""
                    """),_display_(/*139.22*/template/*139.30*/.smallmodal("leaveProject"+p.id.toString)/*139.71*/("danger")/*139.81*/("Leaving "+p.name)/*139.100*/ {_display_(Seq[Any](format.raw/*139.102*/("""
                        """),format.raw/*140.25*/("""<p style="text-align: center">Are you sure you want to leave project """),_display_(/*140.95*/p/*140.96*/.name),format.raw/*140.101*/("""?</p>
                        <div class="btn-group col-xs-6" role="group" style="margin:20px 0px 0px 0px">
                            <a type="button" class="btn btn-default col-xs-12" data-dismiss="modal">Cancel</a>
                        </div>
                        <div class="btn-group col-xs-6" role="group" style="margin:20px 0px 0px 0px">
                            <a class="btn btn-danger col-xs-12" href=""""),_display_(/*145.72*/routes/*145.78*/.ProjectData.leaveProject(p.id)),format.raw/*145.109*/("""">Leave!</a>
                        </div>
                    """)))}),format.raw/*147.22*/("""
                    """),format.raw/*148.41*/("""
                    """),_display_(/*149.22*/template/*149.30*/.smallmodal("addMemberToProject"+p.id.toString)/*149.77*/("info")/*149.85*/("Add a Member to "+p.name)/*149.112*/ {_display_(Seq[Any](format.raw/*149.114*/("""
                        """),_display_(/*150.26*/helper/*150.32*/.form(action = routes.ProjectData.inviteMemberToProjectAs(p.id))/*150.96*/ {_display_(Seq[Any](format.raw/*150.98*/("""
                            """),format.raw/*151.29*/("""<div class="form-group">
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
                        """)))}),format.raw/*168.26*/("""
                    """)))}),format.raw/*169.22*/("""
                    """),_display_(/*170.22*/template/*170.30*/.mediummodal("memberList"+p.id.toString)/*170.70*/("info")/*170.78*/("Members of "+p.name)/*170.100*/ {_display_(Seq[Any](format.raw/*170.102*/("""
                            """),format.raw/*171.29*/("""<!-- Table -->
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>Name</th>
                                    <th style="text-align: center">Role</th>
                                    <th style="text-align: center">Status</th>
                                    <th style="text-align: center">Date</th>
                                    """),_display_(/*179.38*/if(role.role.equals(Role.OWNER))/*179.70*/{_display_(Seq[Any](format.raw/*179.71*/("""
                                        """),format.raw/*180.41*/("""<th style="text-align: center"> </th>
                                    """)))}),format.raw/*181.38*/("""
                                """),format.raw/*182.33*/("""</tr>
                            </thead>
                            <tbody>
                            """),_display_(/*185.30*/ProjectData/*185.41*/.findAllAffiliatedUsers(p.id).map/*185.74*/ { user =>_display_(Seq[Any](format.raw/*185.84*/("""
                                """),_display_(/*186.34*/defining(Role.find.where().eq("project",p).eq("person",user).findUnique())/*186.108*/{ userrole =>_display_(Seq[Any](format.raw/*186.121*/("""
                                    """),format.raw/*187.37*/("""<tr style="font-size: smaller">
                                        <td>"""),_display_(/*188.46*/user/*188.50*/.name),format.raw/*188.55*/("""<br>"""),_display_(/*188.60*/user/*188.64*/.email),format.raw/*188.70*/("""</td>
                                        <td style="text-align: center">"""),_display_(/*189.73*/userrole/*189.81*/.role),format.raw/*189.86*/("""</td>
                                        <td style="text-align: center"> """),_display_(/*190.74*/if(userrole.accepted)/*190.95*/{_display_(Seq[Any](format.raw/*190.96*/("""Joined""")))}/*190.104*/else/*190.109*/{_display_(Seq[Any](format.raw/*190.110*/("""Invited""")))}),format.raw/*190.118*/("""</td>
                                        <td style="text-align: center">
                                        """),_display_(/*192.42*/if(userrole.accepted)/*192.63*/{_display_(Seq[Any](format.raw/*192.64*/("""
                                            """),_display_(/*193.46*/userrole/*193.54*/.dateJoined.toString.substring(0,10)),format.raw/*193.90*/("""
                                        """)))}/*194.43*/else/*194.48*/{_display_(Seq[Any](format.raw/*194.49*/("""
                                            """),_display_(/*195.46*/userrole/*195.54*/.dateInvited.toString.substring(0,10)),format.raw/*195.91*/("""
                                        """)))}),format.raw/*196.42*/("""
                                        """),format.raw/*197.41*/("""</td>
                                        """),_display_(/*198.42*/if(role.role.equals(Role.OWNER) && !currentUser.equals(user) && !userrole.role.equals(Role.OWNER))/*198.140*/{_display_(Seq[Any](format.raw/*198.141*/("""
                                            """),format.raw/*199.45*/("""<td style="text-align: center">
                                                <a href=""""),_display_(/*200.59*/routes/*200.65*/.ProjectData.removeMemberFromProject(user.id, p.id)),format.raw/*200.116*/("""" style="color: red; font-size: larger"><i class="fa fa-close"></i></a>
                                            </td>
                                        """)))}),format.raw/*202.42*/("""
                                    """),format.raw/*203.37*/("""</tr>
                                """)))}),format.raw/*204.34*/("""
                            """)))}),format.raw/*205.30*/("""
                            """),format.raw/*206.29*/("""</tbody>
                        </table>
                    """)))}),format.raw/*208.22*/("""
                    """),_display_(/*209.22*/template/*209.30*/.mediummodal("mendeleyList"+p.id.toString)/*209.72*/("info")/*209.80*/("Mendeley Documents of "+p.name)/*209.113*/ {_display_(Seq[Any](format.raw/*209.115*/("""
                    """),format.raw/*210.21*/("""<!-- Table -->
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>Title</th>
                            <th style="text-align: center">Authors</th>
                            <th style="text-align: center">Type</th>
                            <th style="text-align: center">Year</th>
                            <th style="text-align: center">Status</th>
                        </tr>
                    </thead>
                    <tbody>
                        """),_display_(/*222.26*/ProjectData/*222.37*/.findAllMendeleyDocuments(p.id).map/*222.72*/{ mendeley_doc =>_display_(Seq[Any](format.raw/*222.89*/("""
                            """),format.raw/*223.29*/("""<tr style="font-size: smaller">
                                <td style="overflow: hidden; white-space: nowrap; text-overflow: ellipsis">"""),_display_(/*224.109*/mendeley_doc/*224.121*/.title),format.raw/*224.127*/("""</td>
                                <td style="text-align: center;overflow: hidden; white-space: nowrap; text-overflow: ellipsis">"""),_display_(/*225.128*/mendeley_doc/*225.140*/.authors),format.raw/*225.148*/("""</td>
                                <td style="text-align: center;overflow: hidden; white-space: nowrap; text-overflow: ellipsis">"""),_display_(/*226.128*/mendeley_doc/*226.140*/.doctype),format.raw/*226.148*/("""</td>
                                <td style="text-align: center">"""),_display_(/*227.65*/mendeley_doc/*227.77*/.year),format.raw/*227.82*/("""</td>
                                <td style="text-align: center">
                                    """),_display_(/*229.38*/if(MendeleyDocument.find.where().eq("person",currentUser).eq("title", mendeley_doc.title).findList().size() > 0)/*229.150*/{_display_(Seq[Any](format.raw/*229.151*/("""
                                        """),format.raw/*230.41*/("""<i class="fa fa-check-square" title="You have this document in your library"></i>
                                    """)))}/*231.38*/else/*231.42*/{_display_(Seq[Any](format.raw/*231.43*/("""
                                        """),format.raw/*232.41*/("""<a href=""""),_display_(/*232.51*/routes/*232.57*/.PersonData.postMendeleyDocument(mendeley_doc.id)),format.raw/*232.106*/(""""><i class="fa fa-plus-square" title="Add this to my library"></i></a>
                                    """)))}),format.raw/*233.38*/("""
                                """),format.raw/*234.33*/("""</td>
                            </tr>
                        """)))}),format.raw/*236.26*/("""
                    """),format.raw/*237.21*/("""</tbody>
                </table>
                <a class="pull-right" href="https:www.mendeley.com/library">Go to my Mendeley Library</a>
            """)))}),format.raw/*240.14*/("""
                """)))}),format.raw/*241.18*/("""
            """),format.raw/*242.13*/("""</div>
        """)))}),format.raw/*243.10*/("""
        """),format.raw/*244.9*/("""<!--End of tab content division-->
    </div>
""")))}),format.raw/*246.2*/("""
"""))}
  }

  def render(currentUser:Person,project:Project): play.twirl.api.HtmlFormat.Appendable = apply(currentUser,project)

  def f:((Person,Project) => play.twirl.api.HtmlFormat.Appendable) = (currentUser,project) => apply(currentUser,project)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Mar 11 16:44:04 CET 2015
                  SOURCE: /home/spyruo/gitdir/Virtual.Assistant.TU.Library/Implementation/AssistU/app/views/projects/projectContent.scala.html
                  HASH: d648e43f193a7c03366f10421074632922473b18
                  MATRIX: 749->1|876->40|903->42|950->81|1010->104|1041->109|1102->144|1144->171|1182->172|1222->185|1275->212|1305->234|1343->235|1383->245|1423->259|1432->260|1455->263|1501->283|1614->387|1661->396|1709->417|2143->824|2153->825|2179->830|2266->890|2276->891|2309->903|2442->1009|2509->1066|2550->1068|2631->1121|2671->1134|2681->1135|2711->1144|2740->1145|2834->1212|2871->1240|2911->1242|2996->1299|3033->1309|3206->1461|3256->1484|3266->1485|3296->1494|3325->1495|3573->1725|3586->1730|3625->1731|3710->1788|3747->1798|3920->1950|3970->1973|3980->1974|4010->1983|4039->1984|4298->2212|4379->2262|4456->2312|4520->2366|4560->2367|4641->2421|4658->2429|4694->2444|4775->2494|4852->2544|4918->2600|4958->2601|5039->2655|5056->2663|5104->2690|5185->2740|5258->2785|6117->3617|6158->3649|6198->3651|6287->3712|6328->3726|6343->3732|6399->3766|6621->3957|6706->4014|6747->4028|6762->4034|6816->4066|7112->4334|7123->4335|7148->4338|7293->4456|7335->4489|7374->4490|7463->4551|7554->4614|7565->4615|7590->4618|7631->4631|7647->4637|7710->4678|7882->4819|7968->4878|8009->4910|8048->4911|8137->4972|8234->5041|8245->5042|8270->5045|8423->5167|8508->5224|8618->5307|8735->5414|8776->5416|8865->5477|8956->5540|8967->5541|8992->5544|9194->5728|9207->5733|9246->5734|9335->5795|9428->5860|9439->5861|9464->5864|9615->5984|9696->6037|10339->6653|10356->6661|10409->6693|10474->6731|10541->6789|10580->6790|10653->6835|10764->6919|10781->6927|10826->6951|10895->6989|10964->7030|11365->7425|11414->7447|11431->7455|11480->7495|11497->7503|11534->7530|11575->7532|11628->7558|11643->7564|11704->7616|11744->7618|11801->7647|12127->7946|12138->7947|12167->7954|12891->8650|12902->8651|12930->8656|13626->9323|13638->9324|13673->9336|14048->9683|14059->9684|14090->9693|14668->10239|14722->10261|14772->10320|14822->10342|14840->10350|14893->10393|14913->10403|14954->10433|14996->10435|15050->10460|15123->10505|15134->10506|15161->10511|15634->10956|15650->10962|15706->10995|15805->11062|15855->11119|15905->11141|15923->11149|15974->11190|15994->11200|16024->11219|16066->11221|16120->11246|16218->11316|16229->11317|16257->11322|16708->11745|16724->11751|16778->11782|16875->11847|16925->11888|16975->11910|16993->11918|17050->11965|17068->11973|17106->12000|17148->12002|17202->12028|17218->12034|17292->12098|17333->12100|17391->12129|18644->13350|18698->13372|18748->13394|18766->13402|18816->13442|18834->13450|18867->13472|18909->13474|18967->13503|19461->13969|19503->14001|19543->14002|19613->14043|19720->14118|19782->14151|19918->14259|19939->14270|19982->14303|20031->14313|20093->14347|20178->14421|20231->14434|20297->14471|20402->14548|20416->14552|20443->14557|20476->14562|20490->14566|20518->14572|20624->14650|20642->14658|20669->14663|20776->14742|20807->14763|20847->14764|20875->14772|20890->14777|20931->14778|20972->14786|21119->14905|21150->14926|21190->14927|21264->14973|21282->14981|21340->15017|21402->15060|21416->15065|21456->15066|21530->15112|21548->15120|21607->15157|21681->15199|21751->15240|21826->15287|21935->15385|21976->15386|22050->15431|22168->15521|22184->15527|22258->15578|22453->15741|22519->15778|22590->15817|22652->15847|22710->15876|22805->15939|22855->15961|22873->15969|22925->16011|22943->16019|22987->16052|23029->16054|23079->16075|23665->16633|23686->16644|23731->16679|23787->16696|23845->16725|24014->16865|24037->16877|24066->16883|24228->17016|24251->17028|24282->17036|24444->17169|24467->17181|24498->17189|24596->17259|24618->17271|24645->17276|24780->17383|24903->17495|24944->17496|25014->17537|25153->17656|25167->17660|25207->17661|25277->17702|25315->17712|25331->17718|25403->17767|25543->17875|25605->17908|25702->17973|25752->17994|25937->18147|25987->18165|26029->18178|26077->18194|26114->18203|26192->18250
                  LINES: 26->1|29->1|30->2|30->2|30->2|31->3|32->4|32->4|32->4|33->5|33->5|33->5|33->5|33->5|33->5|33->5|33->5|34->6|34->6|34->6|35->7|41->13|41->13|41->13|42->14|42->14|42->14|44->16|44->16|44->16|45->17|45->17|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|49->21|49->21|49->21|49->21|49->21|53->25|53->25|53->25|54->26|54->26|56->28|56->28|56->28|56->28|56->28|59->31|60->32|61->33|61->33|61->33|62->34|62->34|62->34|63->35|64->36|64->36|64->36|65->37|65->37|65->37|66->38|67->39|76->48|76->48|76->48|77->49|77->49|77->49|77->49|79->51|80->52|80->52|80->52|80->52|82->54|82->54|82->54|83->55|83->55|83->55|84->56|84->56|84->56|84->56|84->56|84->56|84->56|85->57|87->59|87->59|87->59|88->60|88->60|88->60|88->60|89->61|90->62|91->63|91->63|91->63|92->64|92->64|92->64|92->64|94->66|94->66|94->66|95->67|95->67|95->67|95->67|96->68|97->69|107->79|107->79|107->79|108->80|108->80|108->80|109->81|110->82|110->82|110->82|111->83|112->84|120->92|121->93|121->93|121->93|121->93|121->93|121->93|122->94|122->94|122->94|122->94|123->95|126->98|126->98|126->98|134->106|134->106|134->106|142->114|142->114|142->114|147->119|147->119|147->119|154->126|155->127|156->128|157->129|157->129|157->129|157->129|157->129|157->129|158->130|158->130|158->130|158->130|163->135|163->135|163->135|165->137|166->138|167->139|167->139|167->139|167->139|167->139|167->139|168->140|168->140|168->140|168->140|173->145|173->145|173->145|175->147|176->148|177->149|177->149|177->149|177->149|177->149|177->149|178->150|178->150|178->150|178->150|179->151|196->168|197->169|198->170|198->170|198->170|198->170|198->170|198->170|199->171|207->179|207->179|207->179|208->180|209->181|210->182|213->185|213->185|213->185|213->185|214->186|214->186|214->186|215->187|216->188|216->188|216->188|216->188|216->188|216->188|217->189|217->189|217->189|218->190|218->190|218->190|218->190|218->190|218->190|218->190|220->192|220->192|220->192|221->193|221->193|221->193|222->194|222->194|222->194|223->195|223->195|223->195|224->196|225->197|226->198|226->198|226->198|227->199|228->200|228->200|228->200|230->202|231->203|232->204|233->205|234->206|236->208|237->209|237->209|237->209|237->209|237->209|237->209|238->210|250->222|250->222|250->222|250->222|251->223|252->224|252->224|252->224|253->225|253->225|253->225|254->226|254->226|254->226|255->227|255->227|255->227|257->229|257->229|257->229|258->230|259->231|259->231|259->231|260->232|260->232|260->232|260->232|261->233|262->234|264->236|265->237|268->240|269->241|270->242|271->243|272->244|274->246
                  -- GENERATED --
              */
          