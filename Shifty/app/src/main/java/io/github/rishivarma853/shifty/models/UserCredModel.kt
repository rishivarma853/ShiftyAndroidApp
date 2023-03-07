package io.github.rishivarma853.shifty.models

import io.github.rishivarma853.shifty.data.LoginCred

class UserCredModel : BaseModel() {

    var userCredList = ArrayList<LoginCred>()

    override fun initModel() {
        super.initModel()
        userCredList.add(LoginCred("asdf", "asdf"))
    }

}