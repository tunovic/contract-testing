package contracts

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    request {
        method 'GET'
        url('/test')
        headers {
            accept(applicationJson())
            header("X-Authorization", "eyJhbGciOiJIUzI1NiJ9.eyJtZW1iZXJObyI6IjEyMzQ1In0.VdYumw6QkfxaBgFUZNyza1VfNKiZ2WW4JaxIKe-G8HA")
        }
    }
    response {
        status OK()
        body([
                "test": "\"escaped\""
        ])
        headers {
            contentType(applicationJson())
        }
    }
}