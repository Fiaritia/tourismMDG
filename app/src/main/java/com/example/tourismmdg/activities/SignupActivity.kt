import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.tourismmdg.R

class SignupActivity : AppCompatActivity() {

    private val SELECT_PHOTO_REQUEST = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
    }

    fun selectPhotoFromGallery(view: View) {
        val photoPickerIntent = Intent(Intent.ACTION_PICK)
        photoPickerIntent.type = "image/*"
        startActivityForResult(photoPickerIntent, SELECT_PHOTO_REQUEST)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == SELECT_PHOTO_REQUEST && resultCode == Activity.RESULT_OK) {
            val selectedImage = data?.data
            val imageView = findViewById<ImageView>(R.id.photoImageView)

            selectedImage?.let {
                imageView.setImageURI(it)
            }
        }
    }
}
