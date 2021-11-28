package com.mason.myfavoritebooks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.mason.myfavoritebooks.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), FavoriteBooksClickListenerClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateBooks()

        val mainActivity = this
        binding.recyclerView.apply {
            layoutManager = GridLayoutManager(applicationContext, 3)
            adapter = CardAdapter(bookList, mainActivity)
        }
    }

    override fun onClick(myBooks: Books) {
        val intent = Intent(applicationContext, DetailActivity::class.java)
        intent.putExtra(BOOK_ID_DETAILS, myBooks.id)
        startActivity(intent)
    }

    private fun populateBooks() {
        val book1 = Books(
            R.drawable.bornacrime,
            "Trevor Noah",
            "BORN A CRIME",
            "The memoir of one man’s coming-of-age, set during the twilight of apartheid and the tumultuous days of freedom that followed."
        )
        bookList.add(book1)

        val book2 = Books(
            R.drawable.bossypants,
            "Tina Fey",
            "BOSSYPANTS",
            "Before Liz Lemon, before \"Weekend Update,\" before \"Sarah Palin,\" Tina Fey was just a young girl with a dream: a recurring stress dream that she was being chased through a local airport by her middle-school gym teacher. She also had a dream that one day she would be a comedian on TV."
        )
        bookList.add(book2)

        val book3 = Books(
            R.drawable.ramonathepest,
            "Beverly Cleary",
            "RAMONA THE PEST",
            "This is the second title in the hugely popular series about Ramona Quimby. Ramona doesn't think she's a pest - she knows that she isn't a pest on purpose. So how in the world does Ramona get in trouble? Why does Davy run away whenever Ramona comes near him? And how does she manage to disrupt the whole kindergarten class during their rest time? Beverly Cleary is one of America's most popular authors and has won many prestigious awards, including the American Library Association's Laura Ingalls Wilder Award. Ramona the Pest is being published to coincide with the publication of the lastest Ramona title, Ramona's World"
        )
        bookList.add(book3)

        val book4 = Books(
            R.drawable.shawshankredemption,
            "Stephen King",
            "SHAWSHANK REDEMPTION",
            "Andy Dufresne, a banker, was convicted of killing his wife and her lover and sent to Shawshank Prison. He maintains his innocence over the decades he spends at Shawshank during which time he forms a friendship with \"Red\", a fellow inmate."
        )
        bookList.add(book4)

        val book5 = Books(
            R.drawable.thefaultinourstars,
            "John Green",
            "THE FAULT IN OUR STARS",
            "Despite the tumor-shrinking medical miracle that has bought her a few years, Hazel has never been anything but terminal, her final chapter inscribed upon diagnosis. But when a gorgeous plot twist named Augustus Waters suddenly appears at Cancer Kid Support Group, Hazel's story is about to be completely rewritten."
        )
        bookList.add(book5)

        val book6 = Books(
            R.drawable.thegirlonthetrain,
            "Paula Hawkins",
            "THE GIRL ON THE TRAIN",
            "Rachel catches the same commuter train every morning. She knows it will wait at the same signal each time, overlooking a row of back gardens. She’s even started to feel like she knows the people who live in one of the houses. “Jess and Jason,” she calls them. Their life—as she sees it—is perfect. If only Rachel could be that happy. And then she sees something shocking. It’s only a minute until the train moves on, but it’s enough. Now everything’s changed. Now Rachel has a chance to become a part of the lives she’s only watched from afar. Now they’ll see; she’s much more than just the girl on the train..."
        )
        bookList.add(book6)

        val book7 = Books(
            R.drawable.thelovelybones,
            "Alice Sebold",
            "THE LOVELY BONES",
            "\"My name was Salmon, like the fish; first name, Susie. I was fourteen when I was murdered on December 6, 1973.\"\n" +
                    "\n" +
                    "So begins the story of Susie Salmon, who is adjusting to her new home in heaven, a place that is not at all what she expected, even as she is watching life on earth continue without her -- her friends trading rumors about her disappearance, her killer trying to cover his tracks, her grief-stricken family unraveling. Out of unspeakable tragedy and loss, The Lovely Bones succeeds, miraculously, in building a tale filled with hope, humor, suspense, even joy."
        )
        bookList.add(book7)

        val book8 = Books(
            R.drawable.themouseandthemotorcycle,
            "Beverly Cleary",
            "THE MOUSE AND THE MOTORCYCLE",
            "\"Pb-pb-b-b-b. Pb-pb-b-b-b.\" With these magic vocables, Ralph the mouse revs up a dream come true--his very own motorcycle. Living in a knothole in a hotel room, young Ralph has seen plenty of families come and go, some more generous with their crumbs than others. But when young Keith and his parents check in to the hotel, Ralph gets his first chance to check out. He has always fantasized about venturing beyond the second floor, maybe even outside. Curiosity overcomes caution, and Ralph must have a go at Keith's toy motorcycle. Soon, the headstrong mouse finds himself in a pickle, when all he wanted was to ride a motorcycle. Lucky for him, the boy understands how it is. When he discovers Ralph in his thwarted attempt to abscond with the toy bike, Keith generously encourages the rodent to ride. He even teaches him the simple trick of starting the motorcycle: \"You have to make a noise... pb-pb-b-b-b.\" The subsequent situations Ralph motors into require quick thinking and grownup-sized courage."
        )
        bookList.add(book8)

        val book9 = Books(
            R.drawable.twentythreetwelve,
            "Kim Stanley Robinson",
            "2312",
            "The year is 2312. Scientific and technological advances have opened gateways to an extraordinary future. Earth is no longer humanity's only home; new habitats have been created throughout the solar system on moons, planets, and in between. But in this year, 2312, a sequence of events will force humanity to confront its past, its present, and its future."
        )
        bookList.add(book9)

        val book10 = Books(
            R.drawable.twoagainstthetide,
            "Bruce Clements",
            "TWO AGAINST THE TIDE",
            "Tom and Sharon are prisoners on an island paradise off the coast of Maine inhabited by people who have stopped aging owing to a life-preserving drug they are taking.."
        )
        bookList.add(book10)

        bookList.add(book1)
        bookList.add(book2)
        bookList.add(book3)
        bookList.add(book4)
        bookList.add(book5)
        bookList.add(book6)
        bookList.add(book7)
        bookList.add(book8)
        bookList.add(book9)
        bookList.add(book10)

        bookList.add(book1)
        bookList.add(book2)
        bookList.add(book3)
        bookList.add(book4)
        bookList.add(book5)
        bookList.add(book6)
        bookList.add(book7)
        bookList.add(book8)
        bookList.add(book9)
        bookList.add(book10)

        bookList.add(book1)
        bookList.add(book2)
        bookList.add(book3)
        bookList.add(book4)
        bookList.add(book5)
        bookList.add(book6)
        bookList.add(book7)
        bookList.add(book8)
        bookList.add(book9)
        bookList.add(book10)

    }


}