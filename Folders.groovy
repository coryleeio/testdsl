import com.cloudbees.hudson.plugins.folder.*
import org.jenkinsci.plugins.workflow.job.WorkflowJob
import jenkins.model.Jenkins

// folder('project-a') {
//     displayName('Project A')
//     description('Folder for project A')
// }

// folder('project-b') {
//     displayName('Project B')
//     description('Folder for project B')
// }

Jenkins jenkins = Jenkins.instance // saves some typing

if (jenkins.getItem("project-a") == null) {
  // Create the folder if it doesn't exist or if no existing job has the same name
  folder = jenkins.createProject(Folder.class, "project-a")
}

if (jenkins.getItem("project-b") == null) {
  // Create the folder if it doesn't exist or if no existing job has the same name
  folder = jenkins.createProject(Folder.class, "project-b")
}
