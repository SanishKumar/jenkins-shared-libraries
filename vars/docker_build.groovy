def call(String ProjectName, String ImageTag, String DockerHubUser){
  echo "This is building the code"
  sh "whoami"
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
}
