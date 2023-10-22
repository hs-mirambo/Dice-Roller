//creates a custom adapter for the RecyclerView that takes a list of Dice objects as input.
//The DiceViewHolder class is also defined within the DiceAdapter class to hold references to the views in the Card Layout.
class DiceAdapter(private val diceList: List<Dice>) : RecyclerView.Adapter<DiceAdapter.DiceViewHolder>() {

    // Creating a ViewHolder to hold references to the views in the Card Layout
    class DiceViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val diceImage: ImageView = itemView.findViewById(R.id.dice_image)
    }

    // Inflating the Card Layout as an item for the RecyclerView
    // the system needs to create a new instance of a view
    // attributes defined in the layout file
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiceViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.dice_item, parent, false)
        return DiceViewHolder(itemView)
    }

    // Binding the data to the views in the Card Layout
    override fun onBindViewHolder(holder: DiceViewHolder, position: Int) {
        val currentDice = diceList[position]
      // Setting the image resource for the ImageView in the ViewHolder
        holder.diceImage.setImageResource(currentDice.imageResource)
    }

    // Return the length of the RecyclerView
    override fun getItemCount() = diceList.size
}
