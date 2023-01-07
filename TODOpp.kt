

fun main() {



    var task1 = Task (1, "Task 1","this is 1")
    var task2 = Task (2, "Task 2","this is 2")
    var task3 = Task (3, "Task 3","this is 3")

    var todo = Todo(arrayOf(task1,task2,task3))

    todo.addTask(task2)

    todo.showAllTasks()

    todo.printSpecificTask(id = 5)

    todo.changeTask(task2)

    todo.removeTask(task1)


}
data class Task(
    val id: Int,
    val name: String,
    val note: String,
    var isCompleted: Boolean = false
)
class Todo(private var tasks : Array<Task>) {


    fun showAllTasks() {
        for (task in tasks) {
            println(task)
        }
    }

    fun printSpecificTask(id: Int) {
        for (task in tasks) {
            if (task.id == id) {
                println("the task is $task")
                return
            }
        }
        println("Task not found")
    }
    fun addTask (task : Task) {
        tasks += task

    }
    fun removeTask (task :Task){
        tasks.isEmpty()


    }


    fun changeTask(task: Task) {
       println(!task.isCompleted)
    }
}