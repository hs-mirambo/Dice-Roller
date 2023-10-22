// This class sets up the RecyclerView and adapter, and creates a list of Dice objects to be displayed.
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Creating a list of Dice objects
        val diceList = listOf(
            Dice(R.drawable.dice_1),
            Dice(R.drawable.dice_2),
            Dice(R.drawable.dice_3),
            Dice(R.drawable.dice_4),
            Dice(R.drawable.dice_5),
            Dice(R.drawable.dice_6)
        )

        // Setting up the RecyclerView and adapter
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = DiceAdapter(diceList)
        recyclerView.adapter = adapter
    }
}
