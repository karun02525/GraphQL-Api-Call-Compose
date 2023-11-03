# GraphQL-Api-Call-Compose

<img width="620" alt="Screenshot 2023-11-03 at 2 16 16 PM" src="https://github.com/karun02525/GraphQL-Api-Call-Compose/assets/36824081/74543e5f-5284-4f1d-9aad-2f2ec27bc17e">


-- GraphQL allows clients to request only the data they need and nothing more. This reduces over-fetching and under-fetching of data, which is a common problem in REST APIs, 





for ex:
query AllTodos {
  todos {
    edges {
      node {
        completed
        id
        text
        img
      }
    }
  }
}
