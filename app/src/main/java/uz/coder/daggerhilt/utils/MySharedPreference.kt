package uz.coder.daggerhilt.utilsimport android.content.Contextimport android.content.SharedPreferencesimport androidx.core.content.editobject MySharedPreference {    lateinit var sharedPreferences: SharedPreferences    fun getInstance(context: Context) {        sharedPreferences = context.getSharedPreferences(            "" +                    "", Context.MODE_PRIVATE        )    }    var isLogIn: Boolean?        get() = sharedPreferences.getBoolean("isLogIn", false)        set(value) = sharedPreferences.edit {            if (value != null) {                this.putBoolean("isLogIn", value)            }        }}