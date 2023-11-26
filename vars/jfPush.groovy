def call() {
  sh 'cd target' 
      'curl -X PUT -u 'admin:Admin12345' -T kubernetes-configmap-reload-0.0.1-SNAPSHOT.jar http://54.153.8.29:8082/artifactory/example-repo-local/'
}
