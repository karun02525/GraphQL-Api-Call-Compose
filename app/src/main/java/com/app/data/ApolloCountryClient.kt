package com.app.data

import com.apollographql.apollo3.ApolloClient
import com.graphqlapp.CountriesQuery
import com.graphqlapp.CountryQuery
import com.app.domain.CountryClient
import com.app.domain.DetailedCountry
import com.app.domain.SimpleCountry

class ApolloCountryClient(
    private val apolloClient: ApolloClient
): CountryClient {

    override suspend fun getCountries(): List<SimpleCountry> {
        return apolloClient
            .query(CountriesQuery())
            .execute()
            .data
            ?.countries
            ?.map { it.toSimpleCountry() }
            ?: emptyList()
    }

    override suspend fun getCountry(code: String): DetailedCountry? {
        return apolloClient
            .query(CountryQuery(code))
            .execute()
            .data
            ?.country
            ?.toDetailedCountry()
    }
}