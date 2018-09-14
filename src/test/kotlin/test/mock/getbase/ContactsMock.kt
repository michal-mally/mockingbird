package pl.helenium.mockingbird.test.mock.getbase

import pl.helenium.mockingbird.Context
import pl.helenium.mockingbird.DslMock
import pl.helenium.mockingbird.GenericRoute

class ContactsMock(context: Context) : DslMock(context, {

    post("/v2/contacts") {
        GenericRoute(context)
    }

})