def call(String name = "Alice") {
    
    
    node {
    stage("Hello World") {
       script {
        sh """
            echo Hi ${name}
        """
    }
    }
}

    
}
